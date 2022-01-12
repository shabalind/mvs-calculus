  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<double> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<double> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<s0> p1;
    s2(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<std::vector<s0>> p0;
    s2 p1;
    s3(std::vector<std::vector<s0>> v0, s2 v1): p0(v0), p1(v1) { }
  };
  s0 f41(const s0 &v0, const std::vector<s0> &v1) {
    std::vector<s0> v6 = v1;
    const s0 v7 = v1[0];
    std::vector<s0> v3 = v6;
    const s2 v15(v7, v3);
    const s0 v13 = v6[2];
    v3[0] = v13;
    const std::vector<s0> v30 = v15.p1;
    std::vector<s0> v45 = v30;
    const s0 v34 = v3[1];
    v45[2] = v34;
    const s0 v37 = v45[1];
    return v37;
  }
  s3 f28(const s3 &v0) {
    const s2 v3 = v0.p1;
    s3 v7 = v0;
    s2 v5 = v3;
    const std::vector<s2> v1 { v5, v3, v5, v5, v5, v3 };
    v7.p1 = v5;
    s2 v2 = v3;
    s2 v9 = v2;
    v7.p1 = v9;
    std::vector<s2> v8 = v1;
    const s0 v13 = v5.p0;
    const s2 v17 = v8[5];
    const std::vector<std::vector<double>> v6 = v13.p1;
    s3 v11 = v0;
    s3 v12 = v11;
    v9.p0 = v13;
    const s2 v44 = v8[4];
    v8[4] = v44;
    const s0 v54 = v17.p0;
    s0 v34 = v54;
    v5.p0 = v34;
    v2.p0 = v13;
    const std::vector<s0> v31 = v3.p1;
    const s2 v28 = v8[4];
    v5.p0 = v54;
    v7 = v12;
    const s0 v79 = f41(v54, v31);
    const std::vector<double> v49 = v54.p0;
    const s2 v73 = v12.p1;
    v8[0] = v9;
    std::vector<s0> v126 = v31;
    const s2 v42 = v7.p1;
    v34.p0 = v49;
    v11.p1 = v73;
    v126[1] = v13;
    const std::vector<std::vector<double>> v146 = v79.p1;
    v9.p1 = v126;
    v12.p1 = v9;
    v7.p1 = v28;
    const std::vector<s0> v105 = v42.p1;
    v8[2] = v42;
    v34.p1 = v146;
    v2.p1 = v105;
    v34.p1 = v6;
    return v12;
  }
  std::vector<s0> f25(const std::vector<s0> &v0) {
    return v0;
  }
  s3 f17(const s3 &v0) {
    const s3 v6 = f28(v0);
    s3 v5 = v0;
    s3 v7 = v6;
    const s2 v2 = v6.p1;
    v7.p1 = v2;
    const std::vector<std::vector<s0>> v4 = v5.p0;
    const std::vector<std::vector<s0>> v9 = v7.p0;
    v5.p0 = v9;
    const std::vector<s0> v12 = v9[2];
    s2 v21 = v2;
    const s0 v30 = v12[0];
    const std::vector<s0> v29 = v2.p1;
    v5.p0 = v4;
    const std::vector<s0> v24 = f25(v12);
    v7.p1 = v2;
    std::vector<s0> v35 = v29;
    const std::vector<std::vector<s0>> v23 = v6.p0;
    const s3 v19(v23, v21);
    const s0 v27 = v35[2];
    const s0 v53 = v24[0];
    const s3 v32 = f28(v19);
    std::vector<s0> v80 = v29;
    const s0 v95 = v12[0];
    std::vector<std::vector<s0>> v58 = v4;
    const s0 v87 = f41(v95, v29);
    const s2 v42 = v19.p1;
    const std::vector<s0> v142 = v42.p1;
    const s1 v68(v58, v87);
    const std::vector<std::vector<s0>> v79 = v68.p0;
    v21.p1 = v29;
    v21.p1 = v80;
    std::vector<std::vector<s0>> v110 = v79;
    v35[0] = v30;
    v21.p0 = v53;
    v80[0] = v27;
    v21.p1 = v142;
    v7.p0 = v110;
    return v32;
  }
  s0 f4(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p1;
    std::vector<std::vector<double>> v2 = v4;
    const std::vector<double> v6 = v4[2];
    v2[0] = v6;
    v2[0] = v6;
    std::vector<std::vector<double>> v32 = v4;
    const std::vector<std::vector<std::vector<double>>> v12 { v32, v4, v2, v4 };
    const std::vector<double> v9 = v2[2];
    const std::vector<std::vector<double>> v14 = v12[1];
    v32[1] = v6;
    s0 v34 = v0;
    const std::vector<double> v45 = v34.p0;
    v32[2] = v9;
    const s0 v39(v45, v14);
    v34.p1 = v4;
    return v39;
  }
  s2 f1(const s2 &v0) {
    s2 v3 = v0;
    s2 v2 = v3;
    s2 v4 = v0;
    s2 v5 = v4;
    const s0 v6 = v5.p0;
    const s0 v1 = v5.p0;
    s2 v7 = v0;
    v2.p0 = v1;
    s0 v13 = v6;
    const std::vector<double> v9 = v13.p0;
    const s0 v14 = f4(v6);
    s2 v8 = v5;
    const std::vector<s0> v12 = v0.p1;
    v3.p1 = v12;
    v3.p0 = v6;
    v7.p1 = v12;
    v13.p0 = v9;
    s2 v15 = v2;
    const s0 v24 = v12[0];
    v8 = v3;
    const s0 v20 = v12[1];
    v4.p1 = v12;
    const s0 v31 = f41(v24, v12);
    const s0 v16 = v12[1];
    const s0 v30 = f4(v20);
    const std::vector<std::vector<double>> v23 = v20.p1;
    std::vector<s0> v27 = v12;
    v27[0] = v20;
    s0 v81 = v13;
    v27[2] = v31;
    v5.p0 = v16;
    v27[1] = v81;
    std::vector<s0> v57 = v12;
    const s0 v33 = f41(v24, v57);
    const std::vector<s0> v67 = v7.p1;
    v27[1] = v16;
    const s0 v42 = v15.p0;
    v3.p1 = v12;
    v27[1] = v42;
    v81.p1 = v23;
    v57[2] = v1;
    const s0 v95 = v67[2];
    v57[2] = v1;
    v57[0] = v95;
    const std::vector<double> v83 = v13.p0;
    const s0 v103 = v8.p0;
    const s0 v72 = f4(v30);
    v5.p1 = v12;
    const s2 v64(v33, v27);
    const s0 v77 = f41(v30, v57);
    v8.p0 = v72;
    v27[1] = v103;
    v13.p0 = v83;
    v7.p0 = v77;
    v27[1] = v14;
    return v64;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    s3 v4 = v0;
    const s2 v3 = v4.p1;
    const s3 v6 = f28(v0);
    const s3 v5 = f17(v0);
    const s0 v15 = v3.p0;
    const s2 v14 = v6.p1;
    const s0 v12 = f4(v15);
    const s2 v23 = f1(v14);
    v4.p1 = v23;
    const std::vector<std::vector<s0>> v27 = v5.p0;
    const std::vector<double> v21 = v12.p0;
    v4.p0 = v27;
    const std::vector<std::vector<double>> v73 { v21, v21, v21, v21, v21, v21 };
    const std::vector<double> v139 = v73[4];
    v4 = v6;
    const double v140 = v139[0];
    const double v253 = v1 * v140;
    return v253;
  }
  int main() {
    s3 v0({ { { { { 0.0, 1.0 }, { { 2.0 }, { 3.0 }, { 4.0 } } } }, { { { 5.0, 6.0 }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { 10.0, 11.0 }, { { 12.0 }, { 13.0 }, { 14.0 } } } } }, { { { 15.0, 16.0 }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0, 21.0 }, { { 22.0 }, { 23.0 }, { 24.0 } } }, { { 25.0, 26.0 }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { 30.0, 31.0 }, { { 32.0 }, { 33.0 }, { 34.0 } } } } } });
    double v1(35.0);
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
