  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f13(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p0;
    const std::vector<std::vector<double>> v3 = v0.p0;
    const std::vector<double> v5 = v3[0];
    const std::vector<std::vector<double>> v9 = v0.p0;
    const std::vector<std::vector<double>> v7 = v0.p1;
    s0 v8 = v0;
    const double v4 = v5[0];
    s0 v1 = v8;
    const std::vector<double> v2 = v3[1];
    const std::vector<double> v11 = v3[1];
    std::vector<double> v12 = v2;
    v12[0] = v4;
    v12[0] = v4;
    const double v14 = v5[0];
    v8 = v1;
    v12 = v2;
    std::vector<std::vector<double>> v19 = v6;
    const std::vector<std::vector<double>> v30 = v0.p1;
    s0 v20 = v8;
    v20.p1 = v19;
    v8.p1 = v30;
    v19[1] = v11;
    std::vector<std::vector<double>> v28 = v3;
    v1.p0 = v19;
    std::vector<double> v50 = v12;
    v1 = v8;
    const std::vector<std::vector<double>> v29 = v20.p1;
    s0 v23 = v8;
    v19 = v29;
    v23.p1 = v7;
    v8.p0 = v19;
    const std::vector<double> v48 = v19[1];
    std::vector<double> v36 = v50;
    const std::vector<std::vector<double>> v38 = v20.p1;
    std::vector<std::vector<double>> v21 = v7;
    s0 v26 = v0;
    v1.p0 = v30;
    const std::vector<std::vector<double>> v58 = v23.p0;
    v12[0] = v14;
    v20.p0 = v21;
    const double v35 = v36[0];
    const std::vector<std::vector<double>> v66 = v26.p0;
    v23.p1 = v19;
    double v45 = v35;
    double v59 = v45;
    v26.p0 = v28;
    v12[0] = v59;
    std::vector<double> v54 = v48;
    v20.p0 = v66;
    s0 v56 = v23;
    v26.p1 = v9;
    v28[1] = v12;
    v19[1] = v54;
    v20.p1 = v58;
    v23.p0 = v19;
    v1.p0 = v38;
    v20.p0 = v38;
    v26.p1 = v9;
    return v56;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<std::vector<double>> &v1, const double &v2) {
    s0 v5 = v0;
    const std::vector<std::vector<double>> v6 = v0.p0;
    const s0 v29 = f13(v5);
    const std::vector<std::vector<double>> v25 = v29.p1;
    s0 v15 = v29;
    const std::vector<std::vector<double>> v24 = v15.p1;
    const double v21 = v2 * v2;
    v15.p1 = v6;
    const std::vector<double> v76 = v24[0];
    v15.p0 = v25;
    const double v41 = v76[0];
    v15.p0 = v6;
    const double v38 = v21 - v41;
    return v38;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 } } });
    std::vector<std::vector<double>> v1({ { 4.0 } });
    double v2(5.0);
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
