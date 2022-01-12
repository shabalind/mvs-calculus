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
    std::vector<std::vector<s0>> p1;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    std::vector<s0> p1;
    s2(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s2 f36(const s2 &v0) {
    return v0;
  }
  s2 f31(const s2 &v0) {
    const s2 v1 = f36(v0);
    const s2 v2 = f36(v0);
    const s2 v12 = f36(v0);
    const s2 v23 = f36(v12);
    const s2 v15 = f36(v2);
    const s2 v18 = f36(v1);
    const s2 v55 = f36(v18);
    const std::vector<s2> v110 { v55, v15, v23 };
    const s2 v69 = v110[0];
    const s2 v203 = f36(v69);
    return v203;
  }
  std::vector<s2> f24(const std::vector<s2> &v0, const s2 &v1) {
    const s2 v5 = v0[0];
    std::vector<s2> v7 = v0;
    const s2 v9 = f31(v5);
    v7[0] = v9;
    v7[0] = v1;
    v7[0] = v5;
    const s2 v11 = f36(v1);
    const s2 v33 = f36(v11);
    v7[0] = v1;
    const s2 v14 = f31(v33);
    const s2 v18 = f31(v33);
    v7 = v0;
    const s2 v39 = f36(v14);
    const s2 v34 = f36(v18);
    v7[0] = v14;
    const s2 v158 = f31(v39);
    const s2 v118 = f36(v158);
    v7[0] = v118;
    v7[0] = v34;
    return v7;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const std::vector<s2> &v1, const double &v2) {
    const s2 v5 = v1[1];
    const std::vector<s2> v7 = f24(v1, v5);
    const s2 v4 = v7[1];
    const std::vector<s0> v10 = v4.p1;
    const s0 v26 = v10[0];
    const std::vector<std::vector<double>> v15 = v26.p1;
    const std::vector<double> v36 = v15[2];
    const double v46 = v36[0];
    return v46;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } }, { { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { { 12.0 } }, { { 13.0 }, { 14.0 }, { 15.0 } } } }, { { { { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } } } } }, { { { { { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 }, { 27.0 } } }, { { { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } } } }, { { { { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } }, { { { { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } } } } }, { { { { { { 40.0 } }, { { 41.0 }, { 42.0 }, { 43.0 } } }, { { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } }, { { { 48.0 } }, { { 49.0 }, { 50.0 }, { 51.0 } } } }, { { { { { 52.0 } }, { { 53.0 }, { 54.0 }, { 55.0 } } } }, { { { { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } } } } } });
    std::vector<s2> v1({ { { { { 60.0 } }, { { 61.0 }, { 62.0 }, { 63.0 } } }, { { { { 64.0 } }, { { 65.0 }, { 66.0 }, { 67.0 } } } } }, { { { { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } }, { { { { 72.0 } }, { { 73.0 }, { 74.0 }, { 75.0 } } } } } });
    double v2(76.0);
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
