package com.company;

public class Head
{
	private Eyes eyes;
	private Nose nose;
	private Mouth mouth;

	public Head()

	{
		System.out.println("Head has been created");
		Eyes eyes=new Eyes();
		nose=new Nose();
		mouth=new Mouth();
	}

	public Eyes getEyes()
	{
		return eyes;
	}

	public void setEyes(Eyes eyes)
	{
		this.eyes = eyes;
	}

	public Nose getNose()
	{
		return nose;
	}

	public void setNose(Nose nose)
	{
		this.nose = nose;
	}

	public Mouth getMouth()
	{
		return mouth;
	}

	public void setMouth(Mouth mouth)
	{
		this.mouth = mouth;
	}
}