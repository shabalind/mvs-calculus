  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s0 p1;
    s2(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    s1 p1;
    s0 p2;
    s3(s1 v0, s1 v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s7 {
    s2 p0;
    s1 p1;
    s7(s2 v0, s1 v1): p0(v0), p1(v1) { }
  };
  std::vector<s1> f38(const std::vector<s1> &v0) {
    const s1 v1 = v0[1];
    s1 v4 = v1;
    const s1 v6 = v0[1];
    const s1 v8 = v0[1];
    const s1 v3 = v0[1];
    const s0 v7 = v3.p1;
    const std::vector<std::vector<double>> v9 = v7.p1;
    const std::vector<std::vector<double>> v21 = v7.p1;
    const s1 v25 = v0[2];
    const s0 v18 = v4.p0;
    std::vector<s1> v39 = v0;
    v39[2] = v25;
    const s0 v22(v9, v21);
    std::vector<s1> v46 = v0;
    const s0 v60 = v4.p1;
    const s1 v29 = v39[2];
    const s0 v41 = v8.p0;
    v4.p1 = v18;
    std::vector<s1> v37 = v0;
    std::vector<s1> v57 = v37;
    v4.p1 = v60;
    v4.p1 = v41;
    std::vector<s1> v47 = v39;
    v47[0] = v6;
    const std::vector<s1> v76 { v8, v6 };
    const s1 v28 = v46[0];
    v37[1] = v4;
    const s1 v79 = v76[0];
    const s1 v73 = v76[0];
    std::vector<s1> v113 = v76;
    std::vector<s1> v126 = v113;
    const s0 v43 = v29.p0;
    std::vector<s1> v72 = v57;
    v4.p1 = v7;
    v72[0] = v8;
    std::vector<s1> v81 = v72;
    const s1 v130 = v47[0];
    v72[1] = v28;
    const s1 v134 = v126[1];
    const s1 v127 = v72[0];
    v4.p1 = v22;
    v57[2] = v134;
    v37[0] = v73;
    v46[0] = v73;
    v47[1] = v127;
    v57 = v81;
    const std::vector<std::vector<s1>> v218 { v0, v47, v72, v81, v57, v47 };
    v4.p0 = v43;
    v37[2] = v79;
    v37[2] = v130;
    const std::vector<s1> v186 = v218[2];
    return v186;
  }
  s1 f23(const s1 &v0) {
    const s0 v1 = v0.p1;
    const std::vector<std::vector<double>> v8 = v1.p1;
    const s0 v5(v8, v8);
    s0 v2 = v5;
    s0 v9 = v2;
    s0 v14 = v1;
    s1 v10 = v0;
    const std::vector<std::vector<double>> v11 = v14.p1;
    v14 = v1;
    s1 v19 = v10;
    s0 v24 = v14;
    const s0 v22 = v0.p1;
    const s0 v36 = v19.p0;
    s0 v18 = v36;
    const std::vector<std::vector<double>> v17 = v36.p1;
    s1 v27 = v0;
    s0 v50 = v24;
    v14.p0 = v11;
    const std::vector<std::vector<double>> v65 = v22.p0;
    v9.p0 = v17;
    v14.p0 = v11;
    v2.p0 = v65;
    const s0 v53 = v0.p1;
    v2.p0 = v17;
    const std::vector<std::vector<double>> v35 = v53.p1;
    v19 = v10;
    v18.p0 = v35;
    v10.p0 = v18;
    v2.p1 = v35;
    std::vector<std::vector<double>> v58 = v8;
    v18.p0 = v35;
    v50 = v24;
    v18.p0 = v58;
    v27.p1 = v50;
    const s3 v56(v27, v27, v9);
    v14.p1 = v11;
    const s1 v63 = v56.p1;
    return v63;
  }
  s2 f16(const s2 &v0) {
    s2 v4 = v0;
    s2 v6 = v4;
    const s0 v5 = v4.p1;
    const std::vector<std::vector<double>> v9 = v5.p1;
    const s0 v3(v9, v9);
    v6.p1 = v3;
    v4.p1 = v3;
    return v6;
  }
  s0 f1(const s0 &v0) {
    s0 v7 = v0;
    const s1 v4(v0, v7);
    const s1 v3 = f23(v4);
    const s1 v1 = f23(v3);
    s0 v2 = v0;
    const s1 v6 = f23(v1);
    s0 v9 = v2;
    s0 v10 = v0;
    const s1 v20 = f23(v3);
    const s1 v13 = f23(v6);
    const s1 v5 = f23(v13);
    const std::vector<std::vector<double>> v11 = v0.p1;
    v9.p0 = v11;
    v7.p0 = v11;
    s1 v18 = v4;
    const s1 v12 = f23(v1);
    const s0 v22(v11, v11);
    s0 v27 = v2;
    const s1 v14 = f23(v18);
    std::vector<std::vector<double>> v19 = v11;
    const s1 v16 = f23(v18);
    v2.p0 = v19;
    const std::vector<double> v33 = v11[0];
    std::vector<double> v45 = v33;
    const s0 v55 = v20.p0;
    const std::vector<double> v42 = v11[0];
    const std::vector<std::vector<double>> v34 = v27.p0;
    const std::vector<s1> v44 { v5, v12, v16 };
    v10 = v22;
    const double v52 = v42[0];
    v9.p1 = v34;
    const std::vector<std::vector<double>> v39 = v10.p1;
    const std::vector<std::vector<double>> v43 = v9.p1;
    std::vector<std::vector<double>> v62 = v34;
    std::vector<s1> v66 = v44;
    const s1 v90 = f23(v14);
    v19[0] = v33;
    const std::vector<std::vector<double>> v69 = v0.p0;
    const std::vector<s1> v51 = f38(v66);
    v45[0] = v52;
    v19[0] = v45;
    v2.p0 = v69;
    const std::vector<std::vector<s1>> v82 { v66, v51, v66, v66 };
    const std::vector<double> v102 = v11[0];
    v66[1] = v18;
    std::vector<std::vector<s1>> v54 = v82;
    v7.p0 = v39;
    v2.p0 = v19;
    std::vector<s1> v172 = v51;
    v66[1] = v90;
    const s0 v145 = v16.p1;
    const std::vector<s1> v97 = v54[1];
    std::vector<double> v151 = v102;
    v18.p0 = v55;
    v2.p1 = v69;
    v66 = v172;
    v172 = v97;
    v7.p1 = v62;
    v18.p0 = v145;
    v10.p0 = v34;
    const s1 v118 = v172[2];
    v45 = v151;
    const s0 v163 = v118.p0;
    v2.p1 = v43;
    v10.p1 = v39;
    return v163;
  }
  __attribute__((noinline))
  double f0(const s7 &v0, const double &v1) {
    const s2 v6 = v0.p0;
    const s2 v5 = f16(v6);
    const s2 v2 = f16(v5);
    const s2 v3 = f16(v6);
    const s2 v13 = f16(v5);
    s2 v10 = v2;
    const std::vector<s0> v18 = v2.p0;
    const s2 v20 = f16(v2);
    const s2 v9 = f16(v10);
    v10.p0 = v18;
    s2 v40 = v20;
    v10.p0 = v18;
    const s2 v26 = f16(v13);
    const s0 v19 = v18[0];
    s2 v31 = v26;
    const s0 v30 = v18[0];
    const std::vector<s0> v22 = v9.p0;
    const s0 v35 = v22[1];
    const s0 v44 = f1(v35);
    const std::vector<std::vector<double>> v24 = v19.p0;
    const s0 v59 = f1(v35);
    const std::vector<std::vector<double>> v28 = v35.p0;
    const std::vector<std::vector<double>> v25 = v30.p1;
    const std::vector<double> v23 = v25[0];
    const s0 v56 = f1(v44);
    v31 = v40;
    const s0 v37 = f1(v56);
    v10.p1 = v35;
    const std::vector<std::vector<double>> v53 = v59.p0;
    const std::vector<double> v38 = v24[0];
    const std::vector<s0> v76 = v6.p0;
    const s0 v72 = f1(v37);
    v31.p1 = v72;
    v10.p0 = v76;
    const std::vector<s0> v65 = v3.p0;
    const std::vector<double> v82 = v28[0];
    const std::vector<double> v132 = v53[0];
    const std::vector<std::vector<double>> v79 = v30.p0;
    const std::vector<double> v176 = v79[0];
    const std::vector<std::vector<double>> v192 { v38, v23, v23, v176, v38, v132, v82 };
    const s0 v171 = v65[0];
    v40.p1 = v171;
    const std::vector<s0> v174 = v31.p0;
    const std::vector<double> v156 = v192[6];
    const double v154 = v156[0];
    v10.p0 = v174;
    return v154;
  }
  int main() {
    s7 v0({ { { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } } }, { { { 4.0 } }, { { 5.0 } } } }, { { { { 6.0 } }, { { 7.0 } } }, { { { 8.0 } }, { { 9.0 } } } } });
    double v1(10.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
