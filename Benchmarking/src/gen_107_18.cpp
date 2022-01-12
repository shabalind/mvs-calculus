  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  double f81(const double &v0) {
    double v6 = v0;
    double v3 = v6;
    v6 = v0;
    double v1 = v6;
    double v4 = v1;
    double v10 = v0;
    double v2 = v3;
    double v9 = v4;
    double v5 = v6;
    double v12 = v10;
    double v21 = v5;
    const std::vector<double> v27 { v0, v12, v2, v3 };
    std::vector<double> v61 = v27;
    v61[1] = v9;
    const std::vector<std::vector<double>> v16 { v61, v27, v27, v61 };
    const double v33 = v61[0];
    v61[2] = v33;
    std::vector<std::vector<double>> v34 = v16;
    const std::vector<double> v53 = v34[3];
    std::vector<std::vector<double>> v32 = v34;
    std::vector<std::vector<double>> v37 = v32;
    const std::vector<double> v40 = v37[1];
    v61[3] = v21;
    const std::vector<double> v71 = v34[1];
    const std::vector<std::vector<double>> v48 { v71, v71, v71, v27, v53, v71, v40 };
    v32[1] = v61;
    const std::vector<double> v101 = v48[5];
    v34 = v16;
    const double v112 = v101[3];
    return v112;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const std::vector<std::vector<double>> v2 = v0.p0;
    double v10 = v1;
    const std::vector<double> v9 = v2[2];
    std::vector<double> v17 = v9;
    const std::vector<std::vector<double>> v75 { v17, v9, v17, v9, v9 };
    const double v23 = v10 + v1;
    const double v29 = f81(v1);
    v10 = v29;
    std::vector<std::vector<double>> v34 = v75;
    const double v73 = v23 - v1;
    v34[1] = v9;
    const std::vector<double> v59 = v34[0];
    const std::vector<double> v33 = v75[3];
    std::vector<std::vector<double>> v63 = v75;
    v63[4] = v59;
    v63[0] = v59;
    v17[0] = v73;
    v63[1] = v33;
    const double v62 = v17[0];
    v17[0] = v23;
    std::vector<std::vector<double>> v111 = v63;
    v17[0] = v62;
    const std::vector<double> v189 = v111[1];
    const double v190 = v189[0];
    const std::vector<double> v107 = v111[0];
    v63[4] = v107;
    return v190;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } });
    double v1(6.0);
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
