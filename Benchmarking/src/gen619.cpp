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
  struct s3 {
    s1 p0;
    std::vector<s0> p1;
    s3(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s1 f35(const s1 &v0) {
    s1 v1 = v0;
    s1 v2 = v0;
    const std::vector<s0> v7 = v0.p1;
    const s0 v4 = v7[0];
    const s0 v3 = v7[0];
    s1 v9 = v1;
    v1.p1 = v7;
    s1 v8 = v0;
    s0 v16 = v4;
    v9.p0 = v16;
    v9 = v0;
    s1 v12 = v1;
    v9 = v2;
    v2.p0 = v3;
    const std::vector<std::vector<double>> v22 = v3.p0;
    const std::vector<s0> v28 = v12.p1;
    v9.p1 = v28;
    const std::vector<std::vector<double>> v17 = v3.p1;
    const s0 v34 = v7[0];
    v1.p0 = v34;
    const s0 v52 = v9.p0;
    const s0 v64 = v1.p0;
    v16.p1 = v17;
    v12.p0 = v64;
    v12.p0 = v34;
    v16.p0 = v22;
    v9 = v8;
    v9.p0 = v64;
    v16 = v52;
    return v9;
  }
  s1 f20(const s1 &v0) {
    const s1 v1 = f35(v0);
    const s1 v5 = f35(v1);
    const s1 v11 = f35(v0);
    const s1 v3 = f35(v1);
    s1 v9 = v11;
    const std::vector<s1> v6 { v1, v3, v5 };
    const std::vector<s0> v4 = v9.p1;
    const s1 v10 = f35(v5);
    const std::vector<s1> v2 { v10, v3, v3, v11, v11 };
    const s1 v14 = f35(v11);
    std::vector<s0> v22 = v4;
    const s1 v43 = v6[2];
    v9.p1 = v22;
    std::vector<s1> v31 = v2;
    v31[4] = v43;
    const s1 v42 = f35(v14);
    const s1 v59 = v31[2];
    const s1 v147 = f35(v59);
    const s0 v49 = v42.p0;
    v9.p1 = v4;
    v22[0] = v49;
    const s0 v98 = v147.p0;
    const s1 v226(v98, v22);
    return v226;
  }
  s1 f3(const s1 &v0) {
    const s1 v3 = f20(v0);
    const s1 v4 = f20(v0);
    s1 v2 = v0;
    const std::vector<s0> v8 = v3.p1;
    const s0 v6 = v0.p0;
    const s1 v1 = f35(v0);
    const s1 v5(v6, v8);
    const std::vector<s1> v7 { v3, v0, v5, v1, v1, v5, v0 };
    const std::vector<s0> v10 = v2.p1;
    const s1 v13 = f20(v2);
    v2.p1 = v10;
    const s1 v15 = f35(v13);
    std::vector<s1> v21 = v7;
    v21[3] = v2;
    v2.p1 = v10;
    std::vector<s1> v14 = v21;
    v21[0] = v0;
    const std::vector<s0> v32 = v1.p1;
    const s1 v22 = v14[1];
    s1 v27 = v22;
    v21[1] = v15;
    const s1 v56 = v14[2];
    v21 = v7;
    v14[6] = v4;
    v2.p0 = v6;
    std::vector<s1> v67 = v14;
    std::vector<s1> v98 = v67;
    const std::vector<s0> v47 = v22.p1;
    v27.p1 = v8;
    v2.p1 = v32;
    const s1 v51 = f20(v27);
    v27.p1 = v10;
    std::vector<s1> v145 = v98;
    v14[1] = v56;
    v21[5] = v1;
    v14 = v145;
    v2.p1 = v47;
    return v51;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s1 &v1, const double &v2) {
    const s0 v5 = v1.p0;
    const s0 v6 = v1.p0;
    const double v7 = v2 + v2;
    s1 v9 = v1;
    const s0 v17 = v0[2];
    const s3 v10(v9, v0);
    v9.p0 = v6;
    s0 v11 = v5;
    v9.p0 = v17;
    std::vector<s0> v30 = v0;
    const s0 v16 = v30[0];
    v9.p0 = v16;
    const s1 v19 = v10.p0;
    const double v41 = v7 + v7;
    v30[2] = v16;
    const s0 v24 = v19.p0;
    v9.p0 = v5;
    const s1 v29 = f3(v9);
    v30[1] = v6;
    const std::vector<s0> v26 = v29.p1;
    v30[2] = v11;
    double v32 = v2;
    double v39 = v2;
    const std::vector<std::vector<s0>> v60 { v30, v30, v30, v30, v0, v0 };
    std::vector<std::vector<s0>> v44 = v60;
    const std::vector<std::vector<double>> v50 = v24.p0;
    const s0 v85 = v30[2];
    const std::vector<s0> v54 = v44[5];
    v11.p0 = v50;
    const double v74 = v2 / v41;
    const s0 v149 = v26[0];
    const std::vector<std::vector<s0>> v51 { v0, v0, v54, v30, v0, v0, v0 };
    v44[2] = v54;
    const std::vector<s0> v33 = v51[4];
    v9.p0 = v85;
    const std::vector<double> v121 = v50[0];
    v44[1] = v30;
    const std::vector<s0> v89 = v51[6];
    const double v61 = v121[0];
    double v75 = v61;
    const std::vector<std::vector<double>> v168 = v5.p1;
    v9.p0 = v16;
    v9.p0 = v149;
    const s0 v108(v50, v168);
    const double v115 = v74 / v32;
    v30 = v33;
    const double v65 = v75 - v39;
    v9.p0 = v108;
    v44[0] = v89;
    const double v197 = v65 / v115;
    return v197;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } });
    s1 v1({ { { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } }, { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } } } } });
    double v2(25.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
