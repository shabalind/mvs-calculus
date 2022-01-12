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
  s1 f29(const s1 &v0) {
    s1 v7 = v0;
    s1 v1 = v7;
    s1 v5 = v1;
    const s0 v2 = v0.p1;
    const s0 v3 = v5.p1;
    s0 v6 = v3;
    const std::vector<std::vector<double>> v10 = v2.p0;
    v1.p1 = v6;
    s0 v12 = v3;
    s0 v16 = v12;
    const std::vector<std::vector<double>> v20 = v3.p1;
    const std::vector<std::vector<double>> v28 = v6.p1;
    s1 v21 = v7;
    const s1 v22(v12, v16);
    const std::vector<std::vector<double>> v52 = v2.p1;
    v5.p0 = v2;
    const s0 v31 = v21.p1;
    const s0 v44 = v0.p0;
    const std::vector<double> v37 = v52[0];
    const s0 v43 = v22.p0;
    std::vector<std::vector<double>> v23 = v10;
    const std::vector<std::vector<double>> v30 = v31.p0;
    v23[0] = v37;
    const s0 v46(v30, v20);
    v21.p0 = v46;
    s1 v32 = v22;
    const std::vector<std::vector<double>> v51 = v44.p1;
    const s0 v72 = v0.p0;
    v21.p0 = v6;
    v32.p1 = v31;
    s0 v115 = v46;
    const std::vector<std::vector<double>> v45 = v31.p1;
    v7.p0 = v6;
    const std::vector<std::vector<double>> v129 = v43.p1;
    const std::vector<std::vector<std::vector<double>>> v79 { v20, v28, v51, v129, v52, v45, v129 };
    v6 = v115;
    v12.p1 = v52;
    const std::vector<std::vector<double>> v65 = v79[0];
    v6.p0 = v23;
    v115.p1 = v65;
    v12 = v16;
    v5.p1 = v72;
    v5.p0 = v43;
    return v32;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const s1 v7 = f29(v0);
    const s0 v3 = v7.p0;
    const std::vector<double> v4 { v1, v1, v1, v1 };
    const double v2 = v4[1];
    const std::vector<std::vector<double>> v6 = v3.p1;
    const std::vector<double> v16 = v6[1];
    std::vector<double> v74 = v16;
    v74[0] = v2;
    const double v143 = v74[0];
    return v143;
  }
  int main() {
    s1 v0({ { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } }, { { { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } } } });
    double v1(8.0);
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
