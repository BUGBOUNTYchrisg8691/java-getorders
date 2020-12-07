package com.lambdaschool.getorders.services;

import com.lambdaschool.getorders.models.Agent;

public interface AgentServices
{
	Agent findAgentById(long agentid);
	Agent save(Agent agent);
}
