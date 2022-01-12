  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    s0(std::vector<std::vector<double>> v0): p0(v0) { }
  };
  struct s1 {
    s0 p0;
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s1 f49(const s1 &v0) {
    const std::vector<s0> v3 = v0.p1;
    const s0 v4 = v0.p0;
    const std::vector<s0> v8 = v0.p1;
    const std::vector<std::vector<double>> v1 = v4.p0;
    s1 v5 = v0;
    const std::vector<double> v10 = v1[0];
    v5.p1 = v3;
    v5.p1 = v3;
    const std::vector<std::vector<s0>> v2 { v8, v3, v8 };
    v5.p1 = v3;
    std::vector<std::vector<double>> v14 = v1;
    const std::vector<s0> v16 = v0.p1;
    v14[0] = v10;
    const std::vector<s0> v33 = v5.p1;
    const s0 v43(v14);
    v14[0] = v10;
    const std::vector<s0> v20 = v2[2];
    const s1 v32(v43, v20);
    v5.p1 = v8;
    const s0 v48 = v5.p0;
    const std::vector<std::vector<double>> v44 = v48.p0;
    v14 = v44;
    const s0 v70 = v16[1];
    v5.p1 = v33;
    const std::vector<s0> v74 = v32.p1;
    s1 v80 = v5;
    v80.p1 = v3;
    v5.p0 = v70;
    v5.p1 = v74;
    return v80;
  }
  s1 f31(const s1 &v0, const s1 &v1) {
    const s1 v3 = f49(v1);
    const s0 v8 = v1.p0;
    s1 v12 = v3;
    v12.p0 = v8;
    return v12;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    s1 v3 = v0;
    const s1 v2 = f49(v3);
    s1 v5 = v2;
    const s1 v11 = f31(v0, v3);
    const s0 v4 = v11.p0;
    const std::vector<s0> v10 = v5.p1;
    const std::vector<std::vector<double>> v15 = v4.p0;
    std::vector<std::vector<double>> v29 = v15;
    v3.p1 = v10;
    const std::vector<double> v16 = v29[0];
    std::vector<std::vector<double>> v40 = v15;
    v40[0] = v16;
    const std::vector<double> v79 = v40[0];
    v5.p1 = v10;
    v3.p0 = v4;
    const double v135 = v79[0];
    return v135;
  }
  int main() {
    s1 v0({ { { { 0.0 } } }, { { { { 1.0 } } }, { { { 2.0 } } } } });
    double v1(3.0);
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
