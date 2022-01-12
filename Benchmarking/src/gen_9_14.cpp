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
    s1(s0 v0): p0(v0) { }
  };
  s0 f70(const s0 &v0) {
    return v0;
  }
  s0 f68(const s0 &v0) {
    s0 v1 = v0;
    const std::vector<std::vector<double>> v5 = v1.p0;
    const std::vector<s0> v2 { v0 };
    const s0 v9 = f70(v1);
    std::vector<s0> v3 = v2;
    const std::vector<std::vector<double>> v12 = v1.p0;
    v1.p0 = v5;
    const std::vector<std::vector<std::vector<double>>> v18 { v12, v5, v5, v5, v5, v5 };
    const s0 v10 = f70(v9);
    v3[0] = v9;
    const s0 v8 = f70(v10);
    const std::vector<std::vector<double>> v17 = v18[1];
    const std::vector<std::vector<double>> v13 = v10.p0;
    const s0 v22 = f70(v10);
    v1.p0 = v12;
    const s0 v36 = f70(v22);
    v1.p0 = v17;
    v1.p0 = v13;
    const s0 v39 = f70(v8);
    v3[0] = v39;
    std::vector<s0> v31 = v3;
    std::vector<std::vector<std::vector<double>>> v32 = v18;
    const std::vector<std::vector<double>> v42 = v36.p1;
    const std::vector<std::vector<double>> v34 = v32[0];
    const s0 v113(v34, v42);
    const s0 v41 = v31[0];
    const std::vector<std::vector<double>> v100 = v41.p0;
    v32[0] = v100;
    return v113;
  }
  std::vector<s1> f13(const std::vector<s1> &v0) {
    return v0;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const std::vector<s1> v7 = f13(v0);
    const s1 v5 = v7[0];
    const s1 v11 = v7[0];
    const s1 v14 = v7[0];
    s1 v4 = v5;
    const s0 v18 = v14.p0;
    const s0 v34 = v11.p0;
    const s0 v16 = f68(v34);
    const s0 v17 = v4.p0;
    const s1 v35 = v0[0];
    v4.p0 = v18;
    const s0 v69 = f70(v16);
    v4.p0 = v69;
    v4.p0 = v17;
    const std::vector<std::vector<double>> v39 = v17.p1;
    v4.p0 = v17;
    const std::vector<double> v24 = v39[2];
    const s0 v54 = v35.p0;
    const std::vector<std::vector<double>> v38 = v54.p0;
    const s0 v82(v38, v39);
    std::vector<double> v104 = v24;
    v4.p0 = v82;
    v4.p0 = v16;
    v4.p0 = v69;
    const double v144 = v104[0];
    return v144;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 } }, { { 1.0 }, { 2.0 }, { 3.0 } } } } });
    double v1(4.0);
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
