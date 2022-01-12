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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  s2 f67(const s2 &v0) {
    const s1 v5 = v0.p0;
    const std::vector<s2> v2 { v0, v0, v0, v0, v0, v0 };
    const std::vector<s0> v7 = v5.p1;
    const s0 v4 = v7[0];
    const s0 v8 = v5.p0;
    s1 v1 = v5;
    std::vector<s0> v3 = v7;
    const s0 v11 = v3[0];
    v3[0] = v8;
    std::vector<s2> v10 = v2;
    s0 v17 = v4;
    v3[0] = v17;
    v1.p0 = v11;
    const s1 v19 = v0.p1;
    const s2 v23 = v10[1];
    const s2 v27(v19, v1);
    v10[1] = v27;
    return v23;
  }
  s2 f62(const s2 &v0) {
    s2 v4 = v0;
    s2 v7 = v0;
    s2 v9 = v0;
    s2 v11 = v7;
    const s2 v2 = f67(v4);
    s2 v6 = v7;
    s2 v3 = v9;
    const s2 v13 = f67(v0);
    s2 v5 = v11;
    const s1 v23 = v13.p0;
    const s2 v15 = f67(v6);
    v11.p0 = v23;
    s1 v1 = v23;
    const s1 v21 = v15.p0;
    const s2 v38 = f67(v6);
    v3.p1 = v21;
    v6.p0 = v1;
    v6 = v3;
    const s1 v44 = v5.p0;
    const s2 v91 = f67(v2);
    const s1 v112 = v91.p1;
    const s1 v110 = v91.p0;
    const std::vector<s2> v249 { v38 };
    const std::vector<s0> v82 = v112.p1;
    const s1 v114 = v0.p1;
    const std::vector<std::vector<s2>> v102 { v249, v249, v249, v249, v249, v249 };
    const std::vector<s1> v68 { v44, v114, v44 };
    const s1 v85 = v68[1];
    const s1 v106 = v91.p1;
    v9.p0 = v110;
    const std::vector<s2> v59 = v102[3];
    v11.p0 = v21;
    v1.p1 = v82;
    v11.p1 = v85;
    v3.p1 = v44;
    const s2 v201 = v59[0];
    const s2 v126 = f67(v201);
    v11.p0 = v106;
    return v126;
  }
  s0 f52(const s0 &v0) {
    return v0;
  }
  s1 f48(const s1 &v0) {
    const std::vector<s1> v4 { v0, v0 };
    const s0 v1 = v0.p0;
    const s0 v2 = f52(v1);
    const std::vector<std::vector<s1>> v8 { v4, v4, v4 };
    const s0 v6 = f52(v2);
    std::vector<std::vector<s1>> v24 = v8;
    const std::vector<s1> v19 = v24[2];
    const std::vector<s1> v14 = v8[2];
    const std::vector<s0> v43 = v0.p1;
    s1 v39 = v0;
    s1 v26 = v39;
    v39.p0 = v6;
    v24[1] = v14;
    std::vector<s1> v61 = v19;
    const s1 v76 = v61[0];
    const s1 v38 = v61[0];
    v39.p1 = v43;
    std::vector<s0> v62 = v43;
    v39.p1 = v62;
    v26.p1 = v43;
    const s0 v247 = v39.p0;
    v39.p0 = v247;
    v61[0] = v26;
    v61[0] = v76;
    return v38;
  }
  s2 f47(const s2 &v0) {
    const s1 v8 = v0.p1;
    const s1 v4 = f48(v8);
    s1 v5 = v4;
    s2 v9 = v0;
    s2 v6 = v9;
    v9.p1 = v5;
    const s2 v12 = f67(v6);
    v6.p0 = v5;
    return v12;
  }
  s1 f45(const s1 &v0) {
    s1 v2 = v0;
    s1 v4 = v2;
    s1 v5 = v4;
    return v5;
  }
  s1 f40(const s1 &v0, const s2 &v1) {
    const std::vector<s0> v2 = v0.p1;
    const s0 v9 = v2[0];
    std::vector<s0> v16 = v2;
    v16[0] = v9;
    const s1 v20(v9, v16);
    const s1 v51 = f45(v20);
    return v51;
  }
  s2 f27(const s2 &v0) {
    s2 v3 = v0;
    v3 = v0;
    s2 v6 = v0;
    s2 v5 = v3;
    s2 v2 = v3;
    const s1 v9 = v6.p1;
    v3.p0 = v9;
    const s2 v7 = f67(v5);
    v6.p1 = v9;
    const s1 v15 = v6.p0;
    v2.p1 = v9;
    s2 v4 = v0;
    s2 v10 = v0;
    const s1 v8 = v5.p0;
    s1 v17 = v9;
    v6 = v5;
    v5.p1 = v17;
    const s1 v28 = f40(v8, v5);
    const s1 v21 = v4.p1;
    s2 v18 = v7;
    s2 v30 = v2;
    const s1 v19 = f48(v8);
    const s1 v37 = f40(v19, v30);
    const s1 v27 = f48(v28);
    v5 = v7;
    const s1 v51 = f40(v9, v10);
    const s1 v59 = f48(v27);
    const s1 v34 = f40(v51, v18);
    v2.p0 = v59;
    v4.p1 = v17;
    v2.p1 = v17;
    const s1 v87 = f48(v19);
    s2 v35 = v10;
    v3.p1 = v87;
    v2.p0 = v21;
    const s1 v54 = f48(v17);
    v6.p0 = v51;
    v18.p0 = v17;
    v10.p1 = v15;
    v5.p0 = v21;
    const s1 v109 = f48(v54);
    v2 = v3;
    v4.p1 = v17;
    v35.p0 = v34;
    v18.p0 = v27;
    v35.p1 = v17;
    v30.p0 = v51;
    const s1 v205 = f48(v109);
    v6.p0 = v37;
    v2.p0 = v205;
    return v35;
  }
  s2 f21(const s2 &v0) {
    s2 v7 = v0;
    const s2 v6 = f27(v0);
    const s1 v2 = v0.p0;
    const s2 v13 = f47(v7);
    s1 v1 = v2;
    const s1 v5 = v13.p0;
    const s0 v12 = v2.p0;
    const s0 v15 = v1.p0;
    const s0 v10 = f52(v15);
    const s2 v23 = f67(v7);
    s0 v32 = v12;
    v32 = v12;
    v32 = v15;
    s1 v14 = v5;
    const s2 v11 = f27(v6);
    v32 = v10;
    const std::vector<s0> v17 = v14.p1;
    const s1 v46(v15, v17);
    s1 v31 = v14;
    v31 = v5;
    v7.p1 = v46;
    const s2 v27 = f62(v0);
    v31.p0 = v32;
    const s2 v26 = f67(v27);
    v7.p0 = v31;
    s0 v71 = v15;
    s2 v48 = v26;
    const std::vector<s2> v70 { v6, v11, v48, v23 };
    const s2 v68 = v70[3];
    v14.p1 = v17;
    s2 v95 = v68;
    v95.p1 = v5;
    v31.p0 = v71;
    return v95;
  }
  s1 f10(const s1 &v0) {
    const s1 v1 = f45(v0);
    const s1 v2 = f45(v0);
    s1 v6 = v0;
    const s1 v7 = f45(v1);
    s1 v3 = v2;
    const s0 v19 = v7.p0;
    s1 v12 = v3;
    v3 = v6;
    const s0 v43 = v0.p0;
    v6.p0 = v19;
    v12.p0 = v43;
    return v12;
  }
  s1 f5(const s1 &v0) {
    const std::vector<s0> v4 = v0.p1;
    const s2 v5(v0, v0);
    const s2 v3 = f21(v5);
    const s1 v13 = v5.p1;
    const s1 v30 = v3.p0;
    const s2 v14 = f62(v5);
    const s2 v23(v0, v13);
    const s2 v19 = f62(v23);
    const std::vector<s0> v26 = v0.p1;
    const s0 v17 = v26[0];
    const s2 v38 = f67(v23);
    const s1 v87 = v5.p1;
    s2 v27 = v19;
    const s2 v33 = f21(v14);
    v27.p1 = v30;
    s1 v50 = v87;
    const s1 v59 = v33.p0;
    const s1 v61 = f45(v50);
    v50.p1 = v4;
    const s1 v46 = f40(v50, v38);
    v27.p1 = v61;
    const s1 v83 = v14.p0;
    const s1 v116 = f40(v83, v3);
    v27.p0 = v46;
    v50.p0 = v17;
    const s1 v45 = f40(v59, v27);
    v27.p1 = v116;
    const s1 v101 = v19.p0;
    v50 = v101;
    return v45;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const s0 v5 = v0.p0;
    const s1 v4 = f5(v0);
    s0 v7 = v5;
    const std::vector<std::vector<double>> v10 = v7.p0;
    const std::vector<double> v9 = v10[0];
    const std::vector<std::vector<double>> v6 = v5.p0;
    const double v20 = v9[0];
    const s1 v11 = f10(v4);
    s0 v12 = v7;
    std::vector<std::vector<double>> v27 = v10;
    const std::vector<double> v15 = v27[0];
    v7.p0 = v27;
    v7.p0 = v10;
    v27 = v6;
    const double v22 = v15[0];
    v27[0] = v15;
    double v16 = v20;
    const double v35 = v15[0];
    const s1 v23 = f10(v11);
    const std::vector<double> v26 { v35, v35, v22, v22, v16, v35 };
    const std::vector<double> v30 = v10[0];
    const std::vector<std::vector<double>> v24 = v12.p1;
    const double v95 = v30[0];
    const std::vector<double> v46 = v27[0];
    v27[0] = v46;
    const std::vector<double> v59 = v24[1];
    const double v84 = v15[0];
    const double v66 = v26[4];
    const s0 v176 = v23.p0;
    const std::vector<std::vector<double>> v141 = v176.p1;
    v12.p1 = v141;
    v12.p1 = v141;
    v16 = v84;
    v27[0] = v59;
    v16 = v95;
    return v66;
  }
  int main() {
    s1 v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } } });
    double v1(6.0);
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
