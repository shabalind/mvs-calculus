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
    std::vector<std::vector<s0>> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<s0> p1;
    s2(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  double f24(const double &v0) {
    const std::vector<double> v7 { v0, v0 };
    const double v2 = v7[1];
    double v6 = v2;
    const double v11 = v6 / v0;
    const double v3 = v7[1];
    const double v8 = v7[1];
    const double v12 = v7[1];
    std::vector<double> v15 = v7;
    std::vector<double> v10 = v15;
    v15[0] = v8;
    const double v9 = v7[1];
    v10[1] = v11;
    std::vector<double> v16 = v10;
    std::vector<double> v43 = v16;
    v15[0] = v3;
    v43[0] = v12;
    const double v46 = v43[0];
    const double v27 = v16[0];
    std::vector<double> v71 = v43;
    std::vector<double> v34 = v7;
    v71[1] = v9;
    std::vector<double> v41 = v43;
    std::vector<double> v39 = v16;
    const double v47 = v41[0];
    v39[0] = v27;
    v16[1] = v12;
    v15[0] = v0;
    std::vector<double> v38 = v43;
    v39 = v16;
    std::vector<double> v26 = v34;
    const std::vector<std::vector<double>> v79 { v39, v38, v16 };
    v38[0] = v46;
    v43 = v16;
    v43 = v10;
    const std::vector<std::vector<std::vector<double>>> v50 { v79, v79, v79, v79, v79, v79 };
    std::vector<std::vector<std::vector<double>>> v83 = v50;
    v34 = v71;
    std::vector<double> v101 = v39;
    v16 = v26;
    std::vector<std::vector<std::vector<double>>> v62 = v83;
    std::vector<std::vector<double>> v45 = v79;
    std::vector<std::vector<std::vector<double>>> v74 = v62;
    const std::vector<double> v40 = v45[1];
    v71[0] = v47;
    const double v61 = v101[1];
    const double v82 = v40[0];
    v10[0] = v3;
    v41[0] = v0;
    v34[1] = v61;
    const std::vector<std::vector<double>> v109 = v74[1];
    v45 = v109;
    return v82;
  }
  __attribute__((noinline))
  double f0(const std::vector<s2> &v0, const double &v1) {
    double v2 = v1;
    const double v14 = f24(v2);
    double v11 = v1;
    const double v160 = v14 / v11;
    return v160;
  }
  int main() {
    std::vector<s2> v0({ { { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } } }, { { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } } } } } });
    double v1(15.0);
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
