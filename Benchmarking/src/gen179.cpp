  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s1(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f81(const s0 &v0, const s0 &v1) {
    return v0;
  }
  s0 f74(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p1;
    std::vector<std::vector<double>> v2 = v4;
    const std::vector<std::vector<double>> v1 = v0.p1;
    const s0 v3 = f81(v0, v0);
    const s0 v6 = f81(v3, v0);
    std::vector<std::vector<double>> v5 = v2;
    s0 v11 = v3;
    v11.p0 = v5;
    const std::vector<double> v8 = v4[2];
    v11.p1 = v5;
    v11.p0 = v5;
    const std::vector<double> v15 = v1[2];
    const std::vector<std::vector<double>> v18 = v3.p1;
    const std::vector<double> v19 = v5[2];
    const s0 v9 = f81(v6, v6);
    v5[1] = v15;
    const std::vector<std::vector<double>> v21 = v6.p0;
    v11.p1 = v5;
    v2[2] = v8;
    s0 v14 = v6;
    v2[1] = v19;
    const s0 v22 = f81(v14, v0);
    v11.p1 = v5;
    const std::vector<double> v17 = v18[0];
    s0 v29 = v22;
    v29.p0 = v5;
    v11.p0 = v21;
    v5[2] = v17;
    const s0 v26 = f81(v0, v9);
    const s0 v33 = f81(v9, v0);
    const std::vector<std::vector<double>> v103 = v26.p0;
    const s0 v78 = f81(v22, v11);
    v29.p1 = v1;
    v14 = v33;
    const s0 v60 = f81(v78, v26);
    s0 v66 = v22;
    const std::vector<std::vector<double>> v48 = v29.p0;
    v29.p0 = v1;
    const std::vector<std::vector<double>> v129 = v60.p1;
    s0 v67 = v66;
    std::vector<double> v79 = v8;
    s0 v95 = v60;
    v11.p0 = v48;
    v66.p1 = v103;
    const s0 v57 = f81(v0, v6);
    s0 v153 = v6;
    v67.p0 = v48;
    const s0 v115 = f81(v153, v95);
    std::vector<std::vector<double>> v137 = v129;
    v66.p1 = v18;
    const std::vector<std::vector<double>> v91 = v57.p1;
    v67.p1 = v21;
    v95.p0 = v91;
    const s0 v121 = f81(v67, v6);
    const s0 v139 = f81(v121, v115);
    v137[1] = v79;
    v66.p0 = v137;
    return v139;
  }
  s0 f67(const s0 &v0) {
    s0 v3 = v0;
    const std::vector<s0> v6 { v3 };
    s0 v1 = v0;
    const s0 v4 = f74(v1);
    const std::vector<std::vector<double>> v12 = v4.p0;
    v3.p0 = v12;
    std::vector<std::vector<double>> v5 = v12;
    const std::vector<double> v11 = v5[1];
    s0 v10 = v3;
    v3.p0 = v5;
    const std::vector<std::vector<double>> v24 = v10.p0;
    const s0 v19 = v6[0];
    v5[1] = v11;
    v3.p0 = v24;
    return v19;
  }
  s0 f56(const s0 &v0) {
    const s0 v4 = f67(v0);
    const s0 v11 = f67(v0);
    const s0 v26 = f74(v4);
    const s0 v25 = f74(v11);
    const s0 v20 = f74(v11);
    const s0 v114 = f74(v4);
    const s0 v79 = f81(v25, v26);
    const std::vector<std::vector<double>> v140 = v114.p1;
    const s0 v93 = f81(v79, v20);
    const std::vector<std::vector<double>> v249 = v93.p0;
    const s0 v175(v140, v249);
    return v175;
  }
  s0 f50(const s0 &v0) {
    s0 v4 = v0;
    const s0 v3 = f74(v0);
    const std::vector<std::vector<double>> v2 = v3.p0;
    const s0 v7 = f56(v4);
    const s0 v8 = f56(v0);
    const s0 v15 = f81(v0, v8);
    const std::vector<s0> v10 { v3, v7 };
    const std::vector<s0> v20 { v15, v4 };
    const s0 v19 = v20[0];
    v4.p0 = v2;
    const s0 v50 = v10[1];
    const s0 v64 = f67(v50);
    const s0 v58 = f81(v19, v64);
    return v58;
  }
  s0 f45(const s0 &v0) {
    const s0 v8 = f67(v0);
    const s0 v19 = f50(v0);
    const s0 v15 = f50(v19);
    const std::vector<s0> v25 { v19, v19, v15, v0, v8, v19 };
    std::vector<s0> v30 = v25;
    const s0 v104 = v30[5];
    return v104;
  }
  s0 f9(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p1;
    const s0 v3 = f81(v0, v0);
    s0 v2 = v3;
    const std::vector<std::vector<double>> v4 = v2.p1;
    const std::vector<std::vector<double>> v11 = v2.p1;
    const std::vector<double> v10 = v4[2];
    std::vector<std::vector<double>> v17 = v4;
    const std::vector<std::vector<double>> v21 = v3.p1;
    v2.p0 = v6;
    v17[0] = v10;
    v2.p0 = v4;
    s0 v18 = v3;
    v18.p0 = v11;
    const std::vector<double> v20 = v11[1];
    v2.p0 = v17;
    v17[1] = v10;
    v17[1] = v20;
    s0 v31 = v18;
    v31.p0 = v21;
    return v31;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<s1> &v1, const double &v2) {
    const s0 v5 = f9(v0);
    const s0 v8 = f45(v0);
    double v3 = v2;
    const std::vector<std::vector<double>> v17 = v8.p1;
    const std::vector<double> v15 = v17[2];
    const std::vector<std::vector<double>> v9 = v5.p0;
    std::vector<double> v13 = v15;
    const std::vector<double> v20 = v9[1];
    const std::vector<std::vector<double>> v21 = v8.p0;
    const std::vector<double> v14 = v21[2];
    const double v26 = v13[0];
    v13[0] = v3;
    const double v32 = v20[0];
    v13[0] = v32;
    const double v23 = v14[0];
    const double v112 = v26 / v23;
    v13[0] = v112;
    return v112;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } });
    std::vector<s1> v1({ { { { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } }, { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } }, { { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } }, { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } } } } });
    double v2(42.0);
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
