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
    s0 p0;
    std::vector<s0> p1;
    s2(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f80(const s0 &v0) {
    const std::vector<s0> v2 { v0, v0, v0, v0 };
    std::vector<s0> v6 = v2;
    const s0 v9 = v6[0];
    v6[3] = v0;
    v6[1] = v0;
    v6[3] = v0;
    v6[1] = v0;
    v6[0] = v0;
    std::vector<s0> v12 = v6;
    const s0 v21 = v12[1];
    v6[1] = v0;
    const s1 v17(v9, v21);
    const s0 v33 = v2[3];
    v6[0] = v21;
    s1 v44 = v17;
    v44.p0 = v9;
    v44.p1 = v0;
    v6[2] = v33;
    v44.p0 = v0;
    v44.p1 = v33;
    v44.p1 = v0;
    const s0 v40 = v44.p1;
    v44.p1 = v9;
    return v40;
  }
  s0 f76(const s0 &v0) {
    s0 v4 = v0;
    const std::vector<std::vector<double>> v6 = v0.p1;
    const std::vector<std::vector<double>> v3 = v4.p0;
    const std::vector<std::vector<double>> v5 = v0.p1;
    const s0 v8 = f80(v4);
    v4 = v8;
    const std::vector<std::vector<double>> v11 = v8.p0;
    v4 = v8;
    const s0 v13(v11, v6);
    v4.p0 = v11;
    v4.p1 = v5;
    const s0 v14 = f80(v0);
    const s0 v49 = f80(v4);
    const s0 v27 = f80(v13);
    v4.p0 = v3;
    const std::vector<std::vector<double>> v38 = v49.p0;
    v4.p0 = v38;
    v4.p0 = v38;
    const std::vector<std::vector<double>> v23 = v0.p1;
    s0 v36 = v27;
    v36.p1 = v23;
    const std::vector<std::vector<double>> v39 = v14.p1;
    v4.p1 = v39;
    const s0 v42 = f80(v36);
    v36 = v27;
    v36.p1 = v23;
    return v42;
  }
  s0 f54(const s0 &v0) {
    const s0 v5 = f80(v0);
    const std::vector<s0> v3 { v5 };
    const s0 v4 = f76(v5);
    const s0 v10 = v3[0];
    s0 v15 = v5;
    const s0 v30 = f80(v4);
    std::vector<s0> v18 = v3;
    v18 = v3;
    v18[0] = v0;
    const s0 v71 = f80(v10);
    v18[0] = v10;
    const s0 v40 = v18[0];
    const std::vector<std::vector<double>> v32 = v30.p1;
    v15.p1 = v32;
    const s1 v69(v40, v71);
    const s0 v76 = v69.p1;
    v18[0] = v15;
    return v76;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const s0 &v1, const double &v2) {
    const s0 v3 = f54(v1);
    const std::vector<std::vector<double>> v7 = v3.p1;
    const std::vector<double> v29 = v7[1];
    double v22 = v2;
    const double v28 = v29[0];
    double v183 = v28;
    const double v151 = v183 + v22;
    const double v189 = v151 - v151;
    double v133 = v189;
    return v133;
  }
  int main() {
    s2 v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } }, { { { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { { 13.0 }, { 14.0 } } } } });
    s0 v1({ { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 } } });
    double v2(20.0);
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
