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
    s0 p2;
    s1(s0 v0, std::vector<s0> v1, s0 v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s2 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    std::vector<s1> p2;
    s2(s0 v0, std::vector<std::vector<s0>> v1, std::vector<s1> v2): p0(v0), p1(v1), p2(v2) { }
  };
  s0 f38(const s0 &v0) {
    s0 v4 = v0;
    s0 v6 = v0;
    const std::vector<s0> v7 { v6, v0, v4, v6 };
    const s0 v8 = v7[3];
    const s0 v1 = v7[2];
    std::vector<s0> v9 = v7;
    const s0 v11 = v9[0];
    v9[1] = v1;
    const std::vector<std::vector<double>> v5 = v6.p0;
    const std::vector<std::vector<double>> v14 = v1.p0;
    std::vector<std::vector<double>> v17 = v14;
    v17 = v14;
    v6.p0 = v17;
    const std::vector<std::vector<double>> v26 = v8.p1;
    v4.p1 = v26;
    v6.p0 = v5;
    v9[3] = v8;
    return v11;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    const s0 v3 = v0.p0;
    double v6 = v1;
    s2 v11 = v0;
    const s0 v10 = f38(v3);
    const s0 v15 = v11.p0;
    const s0 v14 = f38(v10);
    const std::vector<std::vector<double>> v23 = v15.p1;
    const std::vector<double> v31 = v23[0];
    const double v47 = v31[0];
    double v45 = v6;
    double v54 = v45;
    const double v130 = v54 / v54;
    v11.p0 = v14;
    const double v185 = v47 + v130;
    return v185;
  }
  int main() {
    s2 v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 } } }, { { { { { 3.0 } }, { { 4.0 }, { 5.0 } } } } }, { { { { { 6.0 } }, { { 7.0 }, { 8.0 } } }, { { { { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { 15.0 } }, { { 16.0 }, { 17.0 } } } } } });
    double v1(18.0);
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
