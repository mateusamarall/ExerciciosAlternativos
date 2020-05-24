import { Request, Response } from "express";
import EmailService from "../services/EmailService";
const users = [{ name: "mateus", email: "mateus.amaral018@gmail.com" }];

export default {
  async index(req: Request, res: Response) {
    return res.json(users);
  },

  async create(req: Request, res: Response) {
    const emailService = new EmailService();

    emailService.sendMail({
      to: {
        name: "Mateus Amaral",
        email: "mateus.amaral018@gmail.com",
      },
      message: {
        subject: "bem vindo mateus",
        body: "seja bem vindo",
      },
    });

    return res.send();
  },
};
