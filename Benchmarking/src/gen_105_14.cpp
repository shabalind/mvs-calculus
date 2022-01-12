  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    double p2;
    std::vector<std::vector<double>> p3;
    std::vector<std::vector<double>> p4;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, double v2, std::vector<std::vector<double>> v3, std::vector<std::vector<double>> v4): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<std::vector<s0>> p0;
    s1 p1;
    s2(std::vector<std::vector<s0>> v0, s1 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s2>> &v0, const double &v1) {
    std::vector<std::vector<s2>> v8 = v0;
    double v4 = v1;
    std::vector<std::vector<s2>> v5 = v0;
    double v6 = v4;
    const std::vector<s2> v2 = v0[0];
    v5[0] = v2;
    v5[0] = v2;
    const std::vector<s2> v3 = v0[0];
    const std::vector<s2> v9 = v8[0];
    const s2 v10 = v9[0];
    const s1 v17 = v10.p1;
    const s0 v12 = v17.p1;
    const std::vector<std::vector<double>> v26 = v12.p1;
    double v20 = v6;
    v5[0] = v9;
    const s0 v21 = v17.p0;
    s0 v58 = v12;
    v58.p1 = v26;
    const std::vector<std::vector<double>> v65 = v21.p3;
    const std::vector<std::vector<double>> v36 = v58.p0;
    const std::vector<double> v45 = v36[0];
    std::vector<double> v63 = v45;
    const double v75 = v1 + v20;
    std::vector<std::vector<s2>> v54 = v5;
    v5[0] = v3;
    v58.p2 = v75;
    const std::vector<s2> v39 = v54[0];
    v5[0] = v3;
    v58.p2 = v20;
    const double v126 = v63[0];
    v8[0] = v39;
    v58.p3 = v65;
    v5 = v0;
    return v126;
  }
  int main() {
    std::vector<std::vector<s2>> v0({ { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } }, 5.0, { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 } }, 17.0, { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } }, { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 } }, 29.0, { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } } } });
    double v1(36.0);
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
