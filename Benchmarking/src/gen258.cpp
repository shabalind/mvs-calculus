  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    double p0;
    s0 p1;
    s1(double v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s1> p0;
    s0 p1;
    s3(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s1> p0;
    std::vector<s0> p1;
    std::vector<std::vector<s0>> p2;
    s4(std::vector<s1> v0, std::vector<s0> v1, std::vector<std::vector<s0>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s11 {
    std::vector<s0> p0;
    s3 p1;
    s11(std::vector<s0> v0, s3 v1): p0(v0), p1(v1) { }
  };
  s4 f5(const s4 &v0) {
    s4 v3 = v0;
    const std::vector<s1> v7 = v0.p0;
    s4 v5 = v3;
    std::vector<s1> v2 = v7;
    v3.p0 = v2;
    const std::vector<std::vector<s0>> v8 = v0.p2;
    std::vector<s1> v4 = v7;
    std::vector<std::vector<s0>> v9 = v8;
    const std::vector<s1> v6 = v3.p0;
    const std::vector<s1> v11 = v5.p0;
    const std::vector<std::vector<s0>> v13 = v5.p2;
    const s1 v18 = v6[0];
    const std::vector<s0> v15 = v13[1];
    v9[1] = v15;
    v2[0] = v18;
    const s1 v28 = v11[0];
    v2[0] = v28;
    v3.p2 = v8;
    v5.p0 = v7;
    v3.p2 = v9;
    s4 v50 = v5;
    v50.p0 = v4;
    return v50;
  }
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const std::vector<std::vector<s11>> &v1, const double &v2) {
    const s4 v5 = v0[0];
    const std::vector<s1> v3 = v5.p0;
    std::vector<s4> v10 = v0;
    std::vector<s4> v4 = v10;
    const s4 v7 = f5(v5);
    const s4 v8 = f5(v7);
    std::vector<s1> v12 = v3;
    v4[2] = v5;
    const s4 v30 = f5(v8);
    v4[1] = v30;
    std::vector<s4> v17 = v4;
    const s4 v21 = v17[2];
    v17[1] = v30;
    const s4 v18 = f5(v7);
    const s4 v24 = f5(v18);
    const std::vector<s1> v36 = v21.p0;
    v17 = v0;
    v10[2] = v30;
    const s4 v44 = f5(v24);
    const s1 v26 = v36[0];
    const std::vector<std::vector<s1>> v38 { v12, v36, v12, v36, v12, v36 };
    const std::vector<s1> v79 = v38[4];
    v4[2] = v44;
    v4[1] = v21;
    v10[2] = v8;
    const s1 v101 = v79[0];
    const double v244 = v26.p0;
    const double v198 = v101.p0;
    s1 v155 = v26;
    const double v127 = v198 - v244;
    v12[0] = v155;
    return v127;
  }
  int main() {
    std::vector<s4> v0({ { { { 0.0, { { { 1.0 }, { 2.0 } }, { { 3.0 } } } } }, { { { { 4.0 }, { 5.0 } }, { { 6.0 } } } }, { { { { { 7.0 }, { 8.0 } }, { { 9.0 } } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 } } } } } }, { { { 13.0, { { { 14.0 }, { 15.0 } }, { { 16.0 } } } } }, { { { { 17.0 }, { 18.0 } }, { { 19.0 } } } }, { { { { { 20.0 }, { 21.0 } }, { { 22.0 } } } }, { { { { 23.0 }, { 24.0 } }, { { 25.0 } } } } } }, { { { 26.0, { { { 27.0 }, { 28.0 } }, { { 29.0 } } } } }, { { { { 30.0 }, { 31.0 } }, { { 32.0 } } } }, { { { { { 33.0 }, { 34.0 } }, { { 35.0 } } } }, { { { { 36.0 }, { 37.0 } }, { { 38.0 } } } } } } });
    std::vector<std::vector<s11>> v1({ { { { { { { 39.0 }, { 40.0 } }, { { 41.0 } } }, { { { 42.0 }, { 43.0 } }, { { 44.0 } } } }, { { { 45.0, { { { 46.0 }, { 47.0 } }, { { 48.0 } } } } }, { { { 49.0 }, { 50.0 } }, { { 51.0 } } } } } }, { { { { { { 52.0 }, { 53.0 } }, { { 54.0 } } }, { { { 55.0 }, { 56.0 } }, { { 57.0 } } } }, { { { 58.0, { { { 59.0 }, { 60.0 } }, { { 61.0 } } } } }, { { { 62.0 }, { 63.0 } }, { { 64.0 } } } } } }, { { { { { { 65.0 }, { 66.0 } }, { { 67.0 } } }, { { { 68.0 }, { 69.0 } }, { { 70.0 } } } }, { { { 71.0, { { { 72.0 }, { 73.0 } }, { { 74.0 } } } } }, { { { 75.0 }, { 76.0 } }, { { 77.0 } } } } } } });
    double v2(78.0);
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
