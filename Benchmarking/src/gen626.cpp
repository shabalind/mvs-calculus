  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f44(const s0 &v0) {
    const std::vector<std::vector<double>> v2 = v0.p0;
    std::vector<std::vector<double>> v4 = v2;
    const s0 v17(v4, v4);
    return v17;
  }
  double f41(const double &v0, const s0 &v1) {
    s0 v3 = v1;
    const std::vector<std::vector<double>> v5 = v3.p1;
    std::vector<std::vector<double>> v2 = v5;
    const s0 v4 = f44(v3);
    v3.p0 = v5;
    const std::vector<double> v9 = v5[1];
    const std::vector<std::vector<std::vector<double>>> v6 { v2 };
    const s0 v7 = f44(v4);
    const double v8 = v9[0];
    const std::vector<std::vector<double>> v16 = v6[0];
    const std::vector<double> v17 = v16[0];
    const s0 v19 = f44(v1);
    v3.p0 = v5;
    v2[2] = v17;
    v2[1] = v9;
    const std::vector<std::vector<double>> v26 = v7.p0;
    v3.p1 = v16;
    const double v36 = v17[0];
    const std::vector<std::vector<double>> v57 = v19.p1;
    double v31 = v36;
    const double v53 = v31 / v8;
    v3.p0 = v57;
    v3.p1 = v26;
    return v53;
  }
  s0 f15(const s0 &v0) {
    const s0 v9 = f44(v0);
    s0 v28 = v9;
    return v28;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const s0 v3 = f44(v0);
    s0 v8 = v3;
    const s0 v2 = f15(v3);
    const std::vector<s0> v4 { v0, v2, v8, v0, v8 };
    const s0 v5 = f44(v2);
    const std::vector<std::vector<double>> v9 = v5.p0;
    std::vector<s0> v7 = v4;
    v8.p1 = v9;
    const std::vector<std::vector<double>> v6 = v8.p1;
    v8.p1 = v6;
    std::vector<std::vector<double>> v17 = v6;
    const std::vector<double> v10 = v17[0];
    const std::vector<double> v12 = v9[2];
    std::vector<std::vector<double>> v31 = v9;
    const std::vector<double> v21 { v1, v1, v1, v1 };
    const double v39 = v12[0];
    std::vector<double> v19 = v21;
    v8.p1 = v6;
    const std::vector<std::vector<double>> v15 = v2.p1;
    const std::vector<double> v28 = v31[1];
    const std::vector<std::vector<double>> v50 = v5.p1;
    const s0 v33 = v7[2];
    const double v59 = f41(v39, v5);
    const double v20 = f41(v59, v33);
    v8.p1 = v15;
    const std::vector<std::vector<double>> v26 = v33.p1;
    const double v80 = v39 * v39;
    const double v23 = v12[0];
    std::vector<double> v55 = v12;
    const double v51 = v80 + v23;
    v7[2] = v5;
    v17[2] = v10;
    std::vector<double> v41 = v21;
    const double v49 = v28[0];
    const double v43 = v1 * v1;
    v8.p1 = v50;
    v19[3] = v23;
    std::vector<double> v119 = v12;
    const s0 v64 = v7[4];
    v41[0] = v20;
    v8.p1 = v26;
    v41[1] = v51;
    v55[0] = v59;
    v41 = v19;
    v8.p1 = v17;
    const s0 v92 = v7[2];
    const double v73 = v43 + v23;
    v7[1] = v64;
    v17[0] = v119;
    const std::vector<std::vector<double>> v156 { v41, v21, v19, v41, v19, v41 };
    const std::vector<double> v105 = v156[4];
    const double v116 = v105[0];
    const std::vector<std::vector<double>> v140 = v92.p0;
    v55[0] = v49;
    v19[2] = v73;
    v17[0] = v55;
    v8.p0 = v140;
    return v116;
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
