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
  struct s3 {
    std::vector<std::vector<s0>> p0;
    std::vector<std::vector<s0>> p1;
    s3(std::vector<std::vector<s0>> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  std::vector<std::vector<s0>> f3(const std::vector<std::vector<s0>> &v0) {
    std::vector<std::vector<s0>> v2 = v0;
    const std::vector<s0> v6 = v0[0];
    const s0 v7 = v6[0];
    v2[0] = v6;
    std::vector<std::vector<s0>> v4 = v2;
    v2[0] = v6;
    s0 v1 = v7;
    std::vector<std::vector<s0>> v9 = v4;
    std::vector<s0> v15 = v6;
    const std::vector<std::vector<double>> v25 = v1.p0;
    const std::vector<std::vector<double>> v30 = v1.p1;
    v15[0] = v1;
    std::vector<std::vector<double>> v13 = v25;
    v1.p3 = v13;
    v2[0] = v15;
    v1.p1 = v30;
    v2 = v4;
    return v9;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    s3 v11 = v0;
    s3 v2 = v11;
    const std::vector<std::vector<s0>> v4 = v0.p1;
    const std::vector<std::vector<s0>> v7 = v11.p0;
    const std::vector<s0> v8 = v7[2];
    const std::vector<std::vector<s0>> v9 = f3(v4);
    v11.p1 = v4;
    const std::vector<std::vector<s0>> v17 = f3(v4);
    std::vector<std::vector<s0>> v23 = v17;
    const std::vector<s0> v18 = v7[0];
    v23 = v4;
    std::vector<std::vector<s0>> v14 = v7;
    const s0 v29 = v8[0];
    std::vector<std::vector<s0>> v35 = v9;
    const std::vector<std::vector<double>> v43 = v29.p3;
    v35[0] = v18;
    const std::vector<double> v24 = v43[1];
    const std::vector<std::vector<s0>> v21 = f3(v35);
    const std::vector<s0> v31 = v14[1];
    const std::vector<std::vector<s0>> v36 = f3(v23);
    const std::vector<s0> v49 = v7[2];
    v35[0] = v31;
    const std::vector<std::vector<s0>> v39 = f3(v36);
    const std::vector<s0> v73 = v23[0];
    std::vector<double> v48 = v24;
    v35[0] = v49;
    const std::vector<std::vector<s0>> v41 = f3(v39);
    v35[0] = v31;
    v2.p1 = v21;
    v2.p1 = v9;
    const std::vector<std::vector<s0>> v87 = f3(v41);
    const double v99 = v48[0];
    s3 v129 = v2;
    const std::vector<s0> v57 = v87[0];
    const double v100 = v99 * v99;
    v48[0] = v1;
    std::vector<std::vector<s0>> v92 = v14;
    v92[2] = v57;
    v11 = v129;
    v23[0] = v73;
    v2.p0 = v92;
    return v100;
  }
  int main() {
    s3 v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } }, { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 } } } }, { { { { 9.0 }, { 10.0 } }, { { 11.0 }, { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 } }, { { 16.0 }, { 17.0 } } } }, { { { { 18.0 }, { 19.0 } }, { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 }, { 24.0 } }, { { 25.0 }, { 26.0 } } } } }, { { { { { 27.0 }, { 28.0 } }, { { 29.0 }, { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 } }, { { 34.0 }, { 35.0 } } } } } });
    double v1(36.0);
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
