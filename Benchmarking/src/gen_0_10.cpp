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
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    const std::vector<s1> v6 = v0[1];
    const s1 v12 = v6[0];
    const s0 v9 = v12.p0;
    s0 v10 = v9;
    const s1 v8 = v6[0];
    const std::vector<std::vector<double>> v32 = v10.p1;
    s1 v18 = v8;
    s0 v17 = v9;
    std::vector<std::vector<double>> v11 = v32;
    std::vector<std::vector<double>> v20 = v32;
    s1 v22 = v18;
    const s0 v43 = v8.p0;
    s0 v34 = v17;
    const std::vector<double> v13 = v20[0];
    const s0 v14 = v22.p0;
    v18.p0 = v17;
    v20[0] = v13;
    const std::vector<std::vector<double>> v30 = v43.p0;
    s0 v26 = v43;
    const std::vector<double> v21 = v11[0];
    v17.p0 = v30;
    v34.p0 = v30;
    v34 = v17;
    v18.p0 = v26;
    v22.p0 = v26;
    const std::vector<double> v36 = v11[0];
    v26.p1 = v11;
    const s0 v41 = v22.p0;
    v20[0] = v36;
    const std::vector<std::vector<double>> v31 = v17.p1;
    const std::vector<std::vector<double>> v71 { v13, v36, v13 };
    const std::vector<std::vector<double>> v68 = v34.p1;
    v20[0] = v36;
    v22.p0 = v9;
    const std::vector<double> v27 = v31[0];
    v26 = v14;
    const std::vector<double> v62 = v71[1];
    v11[0] = v62;
    const std::vector<std::vector<double>> v35 = v14.p0;
    v20[0] = v21;
    std::vector<std::vector<double>> v66 = v30;
    const std::vector<std::vector<double>> v37 = v41.p1;
    v26.p0 = v66;
    const std::vector<double> v121 = v66[1];
    const std::vector<std::vector<double>> v48 = v10.p0;
    v66[2] = v62;
    v66[2] = v27;
    const double v110 = v121[0];
    v34.p0 = v35;
    v26.p0 = v48;
    v17.p1 = v68;
    v10.p1 = v37;
    return v110;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } } }, { { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } } } });
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
