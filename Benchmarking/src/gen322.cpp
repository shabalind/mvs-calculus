  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  s0 f76(const s0 &v0) {
    const std::vector<std::vector<double>> v1 = v0.p1;
    const std::vector<std::vector<double>> v6 = v0.p2;
    const std::vector<double> v4 = v6[0];
    s0 v2 = v0;
    const std::vector<double> v5 = v6[0];
    v2 = v0;
    v2 = v0;
    std::vector<std::vector<double>> v8 = v6;
    const std::vector<std::vector<double>> v14 = v0.p0;
    const std::vector<std::vector<double>> v13 = v0.p3;
    const std::vector<double> v10 = v1[0];
    v2 = v0;
    v8[0] = v4;
    v8[0] = v4;
    v2 = v0;
    v2.p0 = v14;
    const std::vector<std::vector<double>> v22 = v0.p1;
    v8[0] = v10;
    const std::vector<std::vector<double>> v19 = v0.p3;
    v8[0] = v5;
    std::vector<std::vector<double>> v28 = v8;
    std::vector<std::vector<double>> v31 = v19;
    v2.p0 = v14;
    const std::vector<std::vector<double>> v34 = v2.p3;
    v2.p2 = v19;
    s0 v32 = v0;
    v31[0] = v5;
    const std::vector<std::vector<double>> v38 = v0.p1;
    v32.p3 = v34;
    s0 v20 = v0;
    const std::vector<std::vector<double>> v27 = v20.p0;
    v2.p2 = v13;
    std::vector<double> v110 = v4;
    v32.p2 = v31;
    const std::vector<std::vector<double>> v49 = v32.p1;
    std::vector<std::vector<double>> v42 = v6;
    const s0 v37(v27, v49, v28, v28);
    v20.p3 = v42;
    v20.p1 = v22;
    const std::vector<std::vector<double>> v52 = v20.p0;
    std::vector<std::vector<double>> v71 = v38;
    v20.p1 = v71;
    v2.p0 = v52;
    v42[0] = v110;
    return v37;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const double &v1) {
    const std::vector<s0> v2 = v0[0];
    const s0 v9 = v2[0];
    s0 v29 = v9;
    const std::vector<std::vector<double>> v19 = v29.p0;
    const s0 v25 = f76(v29);
    const std::vector<std::vector<double>> v23 = v25.p2;
    std::vector<std::vector<double>> v65 = v23;
    const std::vector<std::vector<double>> v28 = v9.p1;
    const std::vector<std::vector<double>> v17 = v29.p0;
    v29.p2 = v65;
    const std::vector<std::vector<double>> v37 = v25.p3;
    const std::vector<double> v46 = v17[0];
    v29.p1 = v28;
    v29.p1 = v28;
    v29.p1 = v28;
    v29.p3 = v37;
    std::vector<double> v58 = v46;
    const double v66 = v46[0];
    v29.p0 = v19;
    v65[0] = v58;
    return v66;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } }, { { 5.0 } }, { { 6.0 } } } } });
    double v1(7.0);
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
