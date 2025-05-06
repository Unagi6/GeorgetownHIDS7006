# GeorgetownHIDS7006
This is the mobile app that can be downloaded.
** Be warn ** The Profile icon leads to a YouTube Video of Lil Jon Taco Tuesday, it was to replace the MainActivity file to check if buttons do work in the code. Also to have a little fun with the Android Studio Functions

## The project Proposal and Goal:
# HandRehab+ App

**Contributors:** Tsegie Kassahun, Austin Cherian, Maxwell Lewis

## Executive Summary

HandRehab+ is a mobile health application designed to enhance post-operative rehabilitation for patients recovering from hand, wrist, and elbow surgeries. The application addresses critical clinical needs in outpatient recovery, including improving patient adherence to home exercise programs, providing structured monitoring of rehabilitation progress, and facilitating communication between patients and their therapy providers. Traditional rehabilitation often relies on paper instructions and infrequent clinic visits, which can result in limited engagement, reduced adherence, and suboptimal outcomes. HandRehab+ aims to bridge these gaps by offering a comprehensive, technology-enabled solution that supports both patients and clinicians throughout the recovery process.

The primary users of HandRehab+ are twofold: (1) post-operative orthopedic patients, particularly individuals recovering from surgeries such as thumb CMC arthroplasty, who require structured, home-based rehabilitation support; and (2) licensed occupational and physical therapists, who use the provider-facing dashboard to remotely monitor patient progress, identify issues early, and adjust rehabilitation plans accordingly. Personas developed for this project include patients like Sally, a 65-year-old recovering from thumb surgery, and providers like Dr. Johnson, a practicing occupational therapist managing multiple post-surgical patients (see Appendix for full persona profiles).

Recent literature supports the integration of mobile health applications in rehabilitation, with numerous studies demonstrating improved adherence and functional outcomes compared to standard paper-based exercise programs. Successful apps such as CareHand for rheumatoid arthritis and smartwatch-integrated stroke rehabilitation platforms have shown that combining multimedia exercise guidance, daily symptom tracking, therapist oversight, and motivational feedback mechanisms significantly enhances rehabilitation engagement and outcomes (Chae et al., 2020; Rodríguez Sánchez-Laulhé et al., 2022). Key functionalities that drive success include video demonstrations, real-time progress dashboards, educational programs to empower self-management, and mechanisms for therapist monitoring or alerts when patient progress stalls. Studies also noted that remote therapist involvement and timely feedback increased user satisfaction and reduced therapy dropout rates.

Conversely, apps with a limited scope, such as basic tennis elbow stretch programs that lacked tracking or feedback components, demonstrated poorer adherence and lower clinical impact (Heales et al., 2017). The literature emphasizes that apps must move beyond passive exercise delivery toward fully interactive, customizable, and supportive platforms. Rehabilitation apps that foster personalization of therapy routines, provide real-time feedback, integrate motivational elements like badges, and maintain communication between patient and therapist consistently yield better clinical results. These findings directly informed the design of HandRehab+, which integrates all of these evidence-based strategies into a single, cohesive platform.

HandRehab+ offers a comprehensive set of features, including daily pre- and post-exercise assessments (pain, grip strength, mood, sleep, and fatigue), video-guided therapeutic exercises customized by therapists, an interactive badge reward system to incentivize adherence, visualized recovery dashboards, AI-assisted video analysis for exercise form and range of motion tracking, and a secure provider dashboard to manage caseloads and deliver remote feedback. The platform is built with planned HIPAA-compliant communication capabilities to protect patient privacy. Preliminary needs assessments conducted with occupational therapists and post-operative patients helped define the app’s core functionalities, and early prototype feedback further validated the app’s user-centered design approach. HandRehab+ is positioned to enhance outpatient rehabilitation by promoting adherence, improving patient engagement, and extending the reach of occupational and physical therapy services beyond the clinic environment.

## Purpose and Scope

### App Purpose

HandRehab+ is a mobile health application designed to support patients undergoing post-operative rehabilitation for upper extremity conditions, including hand, wrist, and elbow surgeries. The app addresses a critical clinical need: limited visibility into patients’ at-home rehabilitation progress. By leveraging patient-generated health data (PGHD), HandRehab+ enables both patients and occupational therapists to track recovery metrics in real time, promote adherence to exercise regimens, and facilitate more informed, timely clinical decision-making. The app aims to reduce reliance on in-person follow-ups while improving outcomes through data-driven, personalized rehabilitation.

### Target Users

The primary users of HandRehab+ are occupational therapists and post-operative patients. Dr. Sarah Johnson, a tech-savvy occupational therapist at a rehab center, represents the provider persona. Her core needs include centralized remote monitoring, simplified communication, and educational tools for patients. She is outcome-focused and seeks tools that integrate with clinical systems. Nathan James, a 65-year-old recovering patient, represents the patient persona. He values visual clarity, simple app navigation, and reminders to stay on track. He struggles with printed rehab instructions and benefits from intuitive, guided digital tools. (See Appendix for full personas.)

### Literature Scan

Mobile health (mHealth) apps are increasingly used in post-surgical rehabilitation to bridge gaps in care through guided exercises, progress tracking, and self-management tools. Recent studies highlight that apps offering personalized rehab plans and feedback loops yield stronger outcomes. For example, the CareHand app for rheumatoid arthritis combined exercise instruction, symptom tracking, and self-management tips, resulting in improved hand function and adherence compared to standard care (Rodríguez Sánchez-Laulhé et al., 2022). Similarly, a smartwatch-based stroke rehab app with real-time monitoring showed significant gains in range of motion and exercise compliance (Chae et al., 2020).

Across the literature, effective rehabilitation apps consistently include multimedia-guided exercises, progress tracking with sensor integration, and clinician oversight. These features enhance patient engagement, support accurate self-monitoring, and allow for dynamic adjustments to care plans (Rodríguez Sánchez-Laulhé et al., 2022; Chae et al., 2020). In contrast, simpler apps without tracking or personalization were less impactful, indicating that interactivity and clinical integration are crucial to therapeutic success (Díaz-Mohedo et al., 2024; George et al., 2018). Co-designed tools aligned with clinical workflows—especially those that leverage AI or support range-of-motion assessment—appear to be better positioned to improve recovery outcomes in occupational therapy (Shah et al., 2022; Fu et al., 2024).

### Feature List

Key features of HandRehab+ are designed to meet the needs of both user groups:

* **PGHD Capture:** Patients complete daily assessments to record pain, grip strength, sleep, and fatigue. AI-enabled video analysis assesses range of motion and movement accuracy.
* **Secure Sharing:** All PGHD is securely transmitted to providers to inform individualized care plans and interventions.
* **Patient Tools:** Includes a video-guided exercise library, progress dashboard, symptom tracking, badge rewards, and educational quiz games.
* **Provider Tools:** Providers can manage caseloads, review real-time metrics, and receive AI-generated alerts for deviations in patient recovery.

Together, these features support a connected, user-friendly rehabilitation experience grounded in real-time data and clinical insight.

## Design Process & User Interface

### Task Analysis

The design of HandRehab+ was guided by a user-centered methodology, underpinned by structured data collection and task analyses. Early in the design phase, we completed a structured assessment of the HandRehab+ work system documenting the Person, Task, Technology, Environment, and Organization components to ensure all contextual factors were captured.

**Table 1) Structured Data Form.**

**Table 1. HandRehab+ Structured Data Collection Form**

Structured data collection framework based on the HandRehab+ work system. This table outlines core components of the system, organized by person, task, technology, environment, and organizational protocols. It captures key questions and real-world examples to guide design decisions and evaluate workflow feasibility in a digital rehabilitation context.

In parallel, we conducted a detailed cognitive task analysis to identify the mental processes patients employ when deciding to complete exercises, estimate pain and fatigue, and recall therapy goals; the full cognitive task collection form is provided in Table 2. Cognitive Task Collection Form.

**Table 2. Cognitive Task Collection Form**

**Table 2. HandRehab+ Cognitive Data Collection Form**

Structured data collection framework based on the HandRehab+ work system. This table outlines core components of the system, organized by person, task, technology, environment, and organizational protocols. It captures key questions and real-world examples to guide design decisions and evaluate workflow feasibility in a digital rehabilitation context.

Building on these insights, we mapped the core patient and provider workflows in a parallel swim-lane diagram to visualize the end-to-end interaction flow (Figure 1) ​Task Analysis. In this diagram, patients proceed through splash screen, sign-in, onboarding, pre-exercise assessment, guided exercise session (with optional AI-assisted form recording), post-exercise assessment, and badge achievement. Simultaneously, therapists log into their dashboard, review caseloads, assign or adjust exercise goals, monitor AI-generated flags (e.g., high pain scores or missed sessions), and track badge engagement. This flowchart informed both the information architecture and navigation patterns within Figma-built wireframes, ensuring a seamless handoff between patient and provider experiences.

**Figure 1. Patient and Provider Workflow**

**Figure 1. Task Analysis Provider/Patient Flowchart**

HandRehab+ App Workflow for Patients and Providers. This flowchart illustrates the parallel processes and decision points within the HandRehab+ app. Patients progress through onboarding, guided exercises, assessments, and interactive learning, while providers monitor AI-generated alerts, review patient metrics, and adjust care plans accordingly. Decision nodes enable timely intervention and personalized feedback.

### Wireframes or Prototypes

All user interface prototypes were created in Figma and iteratively refined based on feedback from occupational therapists and post-operative patients. Key screens include the patient dashboard (with daily progress chart) [Figure 2], exercise library (featuring video demos and AI upload prompts) [Figure 3], and therapist caseload view (showing alerts and patient metrics) [Figure 4+5].

**Figure 2. Patient Dashboard – Home Screen**

The home dashboard summarizes the patient’s weekly schedule, recovery progress (e.g., percentage recovered, reps completed), and offers access to treatment plans and educational modules. It serves as the central hub for daily rehab engagement.

**Figure 3. Daily Exercise Tracker**

This screen shows the patient’s daily rehab exercises with visual status indicators (Not Started, In Progress, Completed). It provides a structured and motivating way to track progress through therapist-assigned activities.

**Figure 4. Provider Dashboard with AI Alerts**

Occupational therapists can view their caseload and receive AI-generated alerts for patients who show warning signs like pain increases or session lapses. This supports proactive intervention and helps providers prioritize care delivery.

**Figure 5. Progress Visualization and Metrics**

This screen displays weekly rehabilitation progress, comparing performance before and after exercises. It includes range of motion, grip strength, and pain metrics—enabling patients and therapists to monitor outcomes and make informed plan adjustments.

### Accessibility Considerations

Accessibility considerations were integral from the outset: we employed high-contrast colors, scalable fonts, and large touch targets; provided optional skip functionality for items like grip-strength measurement when tools are unavailable; and plan to integrate voice-over compatibility and audio guidance in future iterations. Together, these artifacts—the structured data table, cognitive task form, and workflow diagram—anchor our design rationale and demonstrate how HandRehab+ meets both clinical and user needs in an inclusive, evidence-based manner.

## Technical Approach

### Development Stack

The mobile rehabilitation application is built as a native iOS app using Swift and SwiftUI for a fast, responsive, and modern user interface. The backend is hosted in a HIPAA-compliant Amazon Web Services (AWS) environment, using serverless or containerized services such as AWS Lambda, EC2, or Kubernetes. Core backend logic is implemented in either Node.js or Python—both widely adopted in healthcare applications for their scalability and mature libraries. A distinguishing technical feature is the integration of a TensorFlow Lite (LiteRT) model on the iOS device to perform real-time range-of-motion (ROM) analysis using on-device video processing. This preserves privacy by keeping raw video data local and enables accurate, automated joint angle estimation without requiring external sensors.

### Security Plan

The application adopts a defense-in-depth approach to HIPAA compliance. Data is encrypted both at rest (AES-256) and in transit (TLS 1.3). AWS Key Management Service (KMS) handles secure key storage. Role-based access control (RBAC) restricts data visibility based on user role (e.g., patient vs. therapist), and session timeouts and automatic logout protect against unattended access. Authentication tokens are securely stored, and multi-factor authentication (MFA) is implemented for providers. Immutable audit logs track all PHI access and modification events. A formal data retention policy ensures sensitive media (e.g., exercise videos) are deleted after analysis, while other data is retained only as clinically required. Routine security audits and vulnerability patching further reinforce system integrity.

### Data Architecture

Patients input daily rehab data, including pain scores, grip strength, and wellness metrics through the app interface. In parallel, the on-device AI model analyzes exercise videos to extract ROM metrics. All data undergoes validation on both the client (range checking) and server (plausibility verification) before being stored in encrypted HIPAA-compliant cloud databases (e.g., AWS RDS or DynamoDB). Each record is timestamped and linked to the patient’s care plan. Therapists access the data via a secure dashboard with visualizations of patient progress and trend alerts for poor adherence or stalled recovery. This real-time data loop enables early intervention and supports remote patient monitoring.

### Authentication & APIs

User authentication leverages Single Sign-On (SSO) integrated with hospital identity providers, using OAuth 2.0 and OpenID Connect for secure, standards-based access. This allows patients and providers to log in using their existing credentials without storing passwords in the app. The system also integrates with Electronic Health Records (EHRs) via FHIR APIs. Clinical data such as provider assignments and surgery details can be pulled into the app, while rehab metrics—like ROM trends and adherence data—are pushed back to the EHR as FHIR Observation or Communication resources. Alerts can be triggered for therapists when patients deviate from expected recovery trajectories, closing the feedback loop between home-based rehab and clinical oversight.

### Usability Testing

### Method

We conducted six individual usability sessions to validate the HandRehab+ prototype. Two occupational therapists, one physical therapist, and three post-operative patients each completed core workflows: logging in and completing the pre-exercise assessment, performing and recording a guided exercise session, and filling out a brief post-session quiz. Afterward, participants rated their experience via a standardized feedback survey (see Appendix C for the full form) and joined a semi-structured debrief discussion.

### Findings

Overall, participants rated the ease of completing core tasks at an average of 4.3 out of 5. Qualitative insights highlighted three primary areas for improvement:

* **Pain-scale guidance.** A physical therapist observed, “The self-report slider is helpful, but patients often guess their number without knowing what each level truly means.”
* **Exercise demonstrates clarity.** One patient reported, “The GIFs move too fast on the phone—I couldn’t see all of the finger positions.”
* **Quiz simplicity.** An occupational therapist noted, “The quizzes feel cluttered; too many option questions can overwhelm some users.”

### Revisions

In response, we have made the following revisions:

* **Contextual pain guidance.** Tapping the information icon beside the slider now reveals succinct descriptors for each level (e.g., “0 = No pain,” “10 = Worst possible pain”).
* **High-fidelity looping videos.** All GIFs have been replaced with slow-motion MP4s that loop continuously, and in the future, we plan to include play/pause controls to ensure every movement is visible.
* **Streamlined quiz interface.** Each question now occupies its own screen with three clearly labeled answer choices and immediate “Correct!” or “Try again” feedback.

These updates will be re-tested in a second round of sessions to verify that they improve comprehension and reduce errors without introducing new performance issues.

## Final App Summary

HandRehab+ offers a promising and patient-centered approach to post-operative rehabilitation by blending AI, secure cloud architecture, and real-time provider integration into a mobile-first platform. What works well in the current version is the comprehensive feature set tailored to both patients and providers. Patients benefit from multimedia-guided exercises, symptom tracking, gamified incentives (badges), and optional AI-driven range-of-motion (ROM) assessments. On the provider side, the app offers dashboards, alert systems, and streamlined access to rehabilitation metrics, which allow clinicians to monitor and adjust care plans remotely. The integration of Single Sign-On (SSO) and HL7 FHIR APIs also ensures secure authentication and seamless EHR interoperability, further grounding the app in clinical workflows.

However, several challenges remain. On the technical front, implementing accurate on-device computer vision for ROM analysis requires significant model optimization and rigorous testing to ensure reliable outputs across diverse patient contexts. Ethically, there are concerns about equitable access—particularly for patients without smartphones or reliable internet connections. There’s also a need to ensure the platform remains accessible for users with physical disabilities who may struggle with standard mobile input methods.

If further developed into a full-scale product, the next steps would involve robust clinical validation, piloting with diverse user populations, and expanding accessibility. Notably, we propose the addition of voice-to-text and text-to-voice features to support users with motor impairments or limited hand function, enhancing usability and inclusivity. This would further align HandRehab+ with universal design principles and improve engagement across a broader range of rehabilitation patients.

## Appendices

**Figure X. Data architecture diagram of the HandRehab+ App.**

This diagram illustrates the end-to-end data flow from the mobile app to the EHR system. Patients input data and upload rehabilitation videos through a mobile app, where AI-based range-of-motion (ROM) analysis is performed locally using TensorFlow Lite. Results are securely transmitted via a FHIR API to a cloud backend hosted on AWS, built with Node.js/Python APIs and secured with OAuth 2.0 and OpenID Connect. The backend communicates with the EHR system to store ROM scores, pain levels, and provider information, while maintaining encryption, audit logging, and HIPAA compliance.


**Note:** The files are in the `master` branch, not in the `main` branch.

**System:** Android Kotlin
**Code Editor:** Android Studio

## References

* Chae, Sang Hoon, Yushin Kim, Kyoung-Soub Lee, and Hyung-Soon Park. “Development and Clinical Evaluation of a Web-Based Upper Limb Home Rehabilitation System Using a Smartwatch and Machine Learning Model for Chronic Stroke Survivors: Prospective Comparative Study.” *JMIR mHealth and uHealth* 8, no. 7 (July 9, 2020): e17216. [https://doi.org/10.2196/17216](https://doi.org/10.2196/17216).
* Díaz-Mohedo, Esther, Antonio L. Carrillo-León, Andrés Calvache-Mateo, Magdalena Ptak, Natalia Romero-Franco, and Juan Carlos-Fernández. “App-Mohedo®: A Mobile App for the Management of Chronic Pelvic Pain. A Design and Development Study.” *International Journal of Medical Informatics* 186 (June 1, 2024): 105410. [https://doi.org/10.1016/j.ijmedinf.2024.105410](https://doi.org/10.1016/j.ijmedinf.2024.105410).
* Fu, Yan, Yuxin Zhang, Bing Ye, Jessica Babineau, Yan Zhao, Zhengke Gao, and Alex Mihailidis. “Smartphone-Based Hand Function Assessment: Systematic Review.” *Journal of Medical Internet Research* 26 (September 16, 2024): e51564. [https://doi.org/10.2196/51564](https://doi.org/10.2196/51564).
* George, Caitlin, Crystal O. Kean, Robert Stanton, and Luke J. Heales. “PT and OT Helper Golf Elbow: A Mobile App User Guide for Getting a Grip on Medial Epicondylalgia.” *British Journal of Sports Medicine* 52, no. 23 (December 2018): e9. [https://doi.org/10.1136/bjsports-2017-098749](https://doi.org/10.1136/bjsports-2017-098749).
* Rodríguez Sánchez-Laulhé, Pablo, Luis Gabriel Luque-Romero, Francisco José Barrero-García, Ángela Biscarri-Carbonero, Jesús Blanquero, Alejandro Suero-Pineda, and Alberto Marcos Heredia-Rizo. “An Exercise and Educational and Self-Management Program Delivered With a Smartphone App (CareHand) in Adults With Rheumatoid Arthritis of the Hands: Randomized Controlled Trial.” *JMIR mHealth and uHealth* 10, no. 4 (April 7, 2022): e35462. [https://doi.org/10.2196/e35462](https://doi.org/10.2196/e35462).
* Shah, Nirtal, Corey Grunberg, and Zahra Hussain. “Can a Patient Use an App at Home to Measure Knee Range of Motion? Utilizing a Mobile App, Curovate, to Improve Access and Adherence to Knee Range of Motion Measurements.” *International Journal of Sports Physical Therapy* 17, no. 3 (2022): 541–47. [https://doi.org/10.26603/001c.33043](https://doi.org/10.26603/001c.33043).
