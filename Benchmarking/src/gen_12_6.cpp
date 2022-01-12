  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s1> p0;
    s0 p1;
    s2(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f120(const s0 &v0) {
    s0 v4 = v0;
    const std::vector<std::vector<double>> v5 = v0.p0;
    std::vector<std::vector<double>> v1 = v5;
    const std::vector<double> v6 = v1[1];
    const std::vector<std::vector<double>> v2 = v0.p2;
    v4.p0 = v5;
    const std::vector<std::vector<double>> v3 = v4.p2;
    std::vector<std::vector<double>> v7 = v3;
    std::vector<double> v11 = v6;
    v4.p0 = v1;
    const std::vector<double> v18 = v1[1];
    const std::vector<std::vector<double>> v12 = v0.p1;
    v7[2] = v11;
    v4.p1 = v12;
    v4.p1 = v12;
    const std::vector<std::vector<double>> v45 = v0.p0;
    s0 v16 = v4;
    v16.p0 = v1;
    std::vector<std::vector<double>> v24 = v3;
    const std::vector<std::vector<double>> v13 = v16.p0;
    v1[1] = v18;
    v16.p2 = v3;
    v16.p0 = v45;
    const std::vector<std::vector<std::vector<double>>> v29 { v12, v12 };
    s0 v34 = v0;
    v24[2] = v11;
    const std::vector<std::vector<double>> v23 = v29[1];
    const std::vector<double> v22 = v7[1];
    const s0 v41(v5, v12, v24);
    std::vector<std::vector<std::vector<double>>> v44 = v29;
    v16.p2 = v24;
    const s0 v40(v13, v23, v7);
    const std::vector<std::vector<double>> v35 = v34.p1;
    std::vector<std::vector<double>> v28 = v23;
    v4.p1 = v12;
    const std::vector<std::vector<double>> v30 = v40.p1;
    v4.p0 = v1;
    const s0 v69(v5, v28, v24);
    const std::vector<std::vector<double>> v27 = v40.p1;
    s0 v36 = v41;
    v28 = v27;
    const std::vector<std::vector<double>> v58 = v40.p1;
    v36.p2 = v2;
    s0 v64 = v41;
    v4.p1 = v35;
    const std::vector<std::vector<double>> v80 = v69.p0;
    const std::vector<std::vector<double>> v56 = v0.p1;
    const std::vector<std::vector<double>> v98 = v64.p0;
    const std::vector<std::vector<double>> v63 = v36.p1;
    v64.p1 = v58;
    v16 = v41;
    v64.p1 = v35;
    v36.p0 = v45;
    v16.p0 = v98;
    std::vector<std::vector<double>> v81 = v63;
    const std::vector<std::vector<double>> v173 = v44[0];
    v34.p0 = v80;
    v4.p1 = v173;
    v36.p2 = v7;
    v4.p1 = v56;
    v44[1] = v30;
    v28[0] = v22;
    v34.p1 = v81;
    return v64;
  }
  std::vector<s2> f71(const std::vector<s2> &v0) {
    return v0;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s2>> &v0, const double &v1) {
    const std::vector<s2> v4 = v0[2];
    const std::vector<s2> v3 = f71(v4);
    std::vector<std::vector<s2>> v5 = v0;
    std::vector<s2> v12 = v3;
    std::vector<std::vector<s2>> v13 = v5;
    v13[2] = v4;
    const std::vector<s2> v10 = v13[0];
    const s2 v9 = v10[0];
    const s0 v28 = v9.p1;
    const s0 v18 = f120(v28);
    const std::vector<std::vector<double>> v24 = v18.p1;
    v5[0] = v10;
    v13[2] = v10;
    const std::vector<double> v29 = v24[0];
    std::vector<s2> v33 = v12;
    v13[1] = v33;
    const double v72 = v29[0];
    return v72;
  }
  int main() {
    std::vector<std::vector<s2>> v0({ { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { { { 6.0 }, { 7.0 } }, { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } } } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } }, { { { { { { { 24.0 }, { 25.0 } }, { { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { { { 30.0 }, { 31.0 } }, { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } }, { { { { 36.0 }, { 37.0 } }, { { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } } } } } }, { { { 42.0 }, { 43.0 } }, { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } } }, { { { { { { { 48.0 }, { 49.0 } }, { { 50.0 } }, { { 51.0 }, { 52.0 }, { 53.0 } } }, { { { { { 54.0 }, { 55.0 } }, { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } }, { { { { 60.0 }, { 61.0 } }, { { 62.0 } }, { { 63.0 }, { 64.0 }, { 65.0 } } } } } } }, { { { 66.0 }, { 67.0 } }, { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } } } });
    double v1(72.0);
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
