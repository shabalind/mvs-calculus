  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<std::vector<double>> p1;
    s2(s1 v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    double p0;
    s0 p1;
    s4(double v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s2 &v0, const double &v1) {
    s2 v4 = v0;
    const std::vector<std::vector<double>> v6 = v4.p1;
    const s1 v2 = v0.p0;
    const std::vector<std::vector<s0>> v3 = v2.p0;
    const std::vector<std::vector<double>> v11 = v4.p1;
    const s1 v8 = v4.p0;
    const std::vector<double> v12 = v6[0];
    v4.p1 = v11;
    const std::vector<s2> v9 { v0, v0 };
    std::vector<double> v15 = v12;
    v15 = v12;
    const s0 v14 = v8.p1;
    const double v21 = v1 + v1;
    const std::vector<s0> v18 = v3[0];
    v4.p0 = v8;
    v4.p0 = v2;
    std::vector<s0> v20 = v18;
    const double v24 = v15[0];
    const s2 v28 = v9[0];
    const double v29 = v15[0];
    const s0 v30 = v20[0];
    double v25 = v29;
    const double v23 = v25 * v21;
    const s1 v43(v3, v30);
    v4.p0 = v43;
    const std::vector<double> v46 = v11[0];
    const double v57 = v1 / v25;
    v15 = v46;
    const s1 v50 = v28.p0;
    v4.p0 = v50;
    v25 = v24;
    v15[0] = v23;
    const s4 v67(v57, v14);
    const double v92 = v67.p0;
    return v92;
  }
  int main() {
    s2 v0({ { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } } }, { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } }, { { 8.0 }, { 9.0 }, { 10.0 } } });
    double v1(11.0);
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
