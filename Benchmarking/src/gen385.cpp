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
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s2(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f46(const s0 &v0) {
    s0 v4 = v0;
    const std::vector<s0> v6 { v0, v4 };
    s0 v1 = v4;
    v4 = v0;
    s0 v11 = v1;
    const std::vector<std::vector<double>> v3 = v0.p0;
    v11.p0 = v3;
    const std::vector<std::vector<double>> v8 = v11.p1;
    const s0 v17 = v6[1];
    const std::vector<std::vector<double>> v10 = v17.p1;
    std::vector<std::vector<double>> v23 = v8;
    std::vector<std::vector<double>> v20 = v23;
    v20 = v10;
    v4.p1 = v20;
    v1.p0 = v3;
    v4.p1 = v20;
    v4.p1 = v20;
    s0 v16 = v11;
    v4.p1 = v10;
    return v16;
  }
  s1 f42(const s1 &v0) {
    s1 v4 = v0;
    const s0 v7 = v0.p0;
    const s0 v2 = f46(v7);
    const s0 v1 = v0.p0;
    s0 v3 = v2;
    const s0 v11 = v4.p1;
    const s0 v5 = f46(v3);
    const std::vector<std::vector<double>> v12 = v11.p1;
    v4.p1 = v1;
    const s1 v15(v1, v5);
    v3.p1 = v12;
    return v15;
  }
  s0 f40(const s0 &v0) {
    const s0 v6 = f46(v0);
    const std::vector<std::vector<double>> v13 = v6.p0;
    const s0 v25 = f46(v0);
    const s0 v26 = f46(v25);
    s0 v33 = v25;
    v33.p0 = v13;
    v33 = v26;
    const s0 v32 = f46(v33);
    const s0 v51 = f46(v32);
    return v51;
  }
  s0 f33(const s0 &v0) {
    s0 v6 = v0;
    const std::vector<std::vector<double>> v3 = v6.p0;
    const std::vector<double> v2 = v3[0];
    std::vector<double> v8 = v2;
    const s0 v4 = f46(v0);
    v6.p0 = v3;
    const std::vector<std::vector<double>> v5 = v0.p0;
    const s1 v1(v4, v6);
    const s0 v13 = v1.p1;
    const s0 v14 = f46(v0);
    const std::vector<double> v23 = v3[1];
    std::vector<std::vector<double>> v15 = v5;
    const s1 v11(v4, v14);
    v15[0] = v8;
    const double v12 = v23[0];
    const std::vector<double> v7 = v3[1];
    const s0 v18 = v11.p0;
    const s0 v28 = f46(v14);
    const std::vector<double> v16 = v5[1];
    const s1 v19 = f42(v11);
    std::vector<std::vector<double>> v24 = v3;
    const s1 v25 = f42(v1);
    const s0 v32 = v25.p0;
    v8 = v7;
    v6.p0 = v5;
    const s0 v43 = f46(v28);
    std::vector<std::vector<double>> v20 = v15;
    const s0 v22 = f40(v13);
    const double v42 = v2[0];
    const std::vector<s1> v30 { v19, v25, v11, v19, v11, v1, v25 };
    v20 = v5;
    const s0 v33 = f46(v43);
    const std::vector<double> v61 = v24[0];
    v6.p0 = v5;
    v15[1] = v61;
    std::vector<s1> v60 = v30;
    std::vector<std::vector<double>> v35 = v24;
    v24[0] = v16;
    const s1 v66 = v60[5];
    const s0 v75 = v11.p1;
    v35[1] = v8;
    v35 = v3;
    std::vector<double> v41 = v8;
    v6.p0 = v20;
    const std::vector<std::vector<double>> v51 = v22.p1;
    const std::vector<std::vector<double>> v96 = v0.p0;
    const s1 v40 = f42(v66);
    std::vector<std::vector<double>> v101 = v51;
    const s0 v65 = v40.p0;
    v6.p0 = v5;
    const s1 v94 = f42(v66);
    const std::vector<s0> v64 { v0, v65 };
    double v83 = v12;
    const std::vector<std::vector<double>> v142 = v75.p0;
    v24[1] = v41;
    const s0 v58 = v64[1];
    const std::vector<std::vector<double>> v73 = v18.p1;
    const s1 v123 = f42(v94);
    const s0 v105 = f40(v32);
    v6.p1 = v101;
    v20[0] = v61;
    std::vector<double> v86 = v41;
    const s0 v133 = v11.p0;
    const std::vector<std::vector<double>> v89 = v105.p0;
    v6.p0 = v35;
    v6.p0 = v3;
    const s0 v52 = f40(v133);
    const std::vector<std::vector<double>> v137 = v58.p1;
    const std::vector<std::vector<double>> v108 = v0.p1;
    const double v144 = v12 * v42;
    const s1 v208 = f42(v123);
    v6.p1 = v73;
    v8[0] = v83;
    v6.p1 = v108;
    const std::vector<std::vector<double>> v117 = v52.p0;
    v6.p0 = v96;
    const s0 v155 = v208.p0;
    std::vector<std::vector<double>> v69 = v117;
    v6.p0 = v89;
    s0 v291 = v155;
    const std::vector<std::vector<double>> v162 = v33.p1;
    v291.p0 = v142;
    v86[0] = v144;
    v291.p1 = v162;
    v8 = v86;
    v291.p1 = v137;
    v6.p0 = v69;
    v6.p0 = v35;
    return v291;
  }
  double f26(const double &v0) {
    double v6 = v0;
    double v3 = v0;
    double v7 = v3;
    double v5 = v0;
    double v2 = v5;
    double v1 = v7;
    double v8 = v5;
    v7 = v0;
    double v4 = v2;
    double v18 = v8;
    const double v19 = v0 + v3;
    double v12 = v2;
    const double v11 = v0 - v6;
    double v13 = v4;
    v18 = v0;
    v5 = v2;
    double v16 = v11;
    double v25 = v1;
    double v30 = v18;
    double v17 = v12;
    const double v46 = v30 + v6;
    const std::vector<double> v9 { v25, v5, v17, v46, v16, v17 };
    const std::vector<double> v23 { v30, v25, v19, v11, v13, v6 };
    const double v22 = v23[3];
    std::vector<double> v26 = v9;
    const double v29 = v26[0];
    v26[0] = v6;
    const std::vector<double> v48 { v22, v30, v11, v4, v29 };
    v26[2] = v5;
    std::vector<double> v39 = v48;
    const double v58 = v39[1];
    return v58;
  }
  s0 f23(const s0 &v0, const s0 &v1) {
    const s0 v5 = f46(v1);
    const std::vector<std::vector<double>> v4 = v1.p0;
    const std::vector<std::vector<double>> v13 = v5.p1;
    const std::vector<double> v9 = v4[1];
    const double v28 = v9[0];
    const std::vector<std::vector<double>> v18 = v1.p0;
    const std::vector<double> v15 = v13[0];
    std::vector<double> v20 = v9;
    const std::vector<std::vector<double>> v12 = v1.p1;
    const double v65 = f26(v28);
    const double v24 = f26(v65);
    v20[0] = v65;
    v20[0] = v65;
    std::vector<std::vector<double>> v17 = v4;
    v17[1] = v20;
    v20[0] = v28;
    v17[1] = v15;
    v20[0] = v24;
    const double v26 = v9[0];
    const s0 v30(v17, v12);
    const std::vector<double> v27 = v12[1];
    v17[0] = v27;
    v20[0] = v26;
    s0 v53 = v30;
    std::vector<std::vector<double>> v51 = v18;
    v53.p0 = v51;
    v17 = v18;
    return v53;
  }
  s2 f21(const s2 &v0) {
    return v0;
  }
  s2 f20(const s2 &v0) {
    s2 v1 = v0;
    v1 = v0;
    const std::vector<std::vector<s0>> v35 = v1.p0;
    const s2 v88 = f21(v1);
    v1.p0 = v35;
    return v88;
  }
  s2 f18(const s2 &v0) {
    const s2 v5 = f21(v0);
    const s2 v26 = f20(v0);
    const std::vector<std::vector<s0>> v46 = v5.p0;
    const s2 v159 = f21(v26);
    s2 v112 = v159;
    v112.p0 = v46;
    const s2 v254 = f20(v112);
    return v254;
  }
  s2 f9(const s2 &v0) {
    return v0;
  }
  s0 f6(const s0 &v0) {
    const std::vector<s0> v1 { v0, v0, v0, v0, v0 };
    const s1 v7(v0, v0);
    const s0 v3 = v1[2];
    const s0 v6 = v1[3];
    const s0 v9 = v7.p1;
    const std::vector<std::vector<double>> v2 = v3.p1;
    const std::vector<double> v12 = v2[0];
    std::vector<std::vector<double>> v15 = v2;
    v15[0] = v12;
    s0 v14 = v9;
    std::vector<std::vector<double>> v25 = v15;
    v14.p1 = v2;
    const s0 v19 = f23(v14, v14);
    const std::vector<std::vector<double>> v28 = v3.p1;
    const s0 v22 = f33(v19);
    v14.p1 = v15;
    v14.p1 = v25;
    v14.p1 = v28;
    v14 = v6;
    return v22;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const double &v1) {
    const s2 v5 = v0[0];
    std::vector<s2> v7 = v0;
    const s2 v2 = f9(v5);
    v7[0] = v2;
    const s2 v4 = f9(v2);
    const s2 v9 = v7[0];
    const s2 v15 = f9(v2);
    s2 v8 = v9;
    v7[0] = v2;
    const s2 v14 = v7[0];
    const s2 v29 = f18(v4);
    const s2 v17 = f18(v14);
    const s0 v21 = v9.p1;
    const s0 v33 = f6(v21);
    v7[0] = v15;
    const s0 v35 = v17.p1;
    const s0 v25 = f33(v33);
    const std::vector<std::vector<double>> v67 = v35.p1;
    s0 v37 = v25;
    std::vector<std::vector<double>> v34 = v67;
    v37.p1 = v34;
    v7[0] = v5;
    const std::vector<double> v50 = v34[0];
    const double v48 = v50[0];
    const std::vector<std::vector<double>> v117 = v37.p1;
    v8 = v5;
    v7[0] = v8;
    const std::vector<double> v87 = v117[2];
    v7[0] = v29;
    double v151 = v48;
    v34[1] = v87;
    return v151;
  }
  int main() {
    std::vector<s2> v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } } }, { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } } });
    double v1(20.0);
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
