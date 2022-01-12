  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const double &v1) {
    const s0 v7 = v0[0];
    std::vector<s0> v5 = v0;
    const std::vector<std::vector<double>> v4 = v7.p1;
    const s0 v3 = v0[0];
    const std::vector<std::vector<double>> v9 = v7.p1;
    const std::vector<std::vector<double>> v2 = v7.p0;
    std::vector<s0> v6 = v0;
    const s0 v17(v2, v4);
    std::vector<std::vector<double>> v10 = v2;
    s0 v13 = v3;
    const std::vector<double> v8 = v2[1];
    const std::vector<std::vector<double>> v11 = v13.p1;
    const std::vector<std::vector<double>> v12 = v3.p1;
    v13.p1 = v11;
    const std::vector<double> v22 = v2[0];
    v6[0] = v17;
    const std::vector<std::vector<double>> v15 = v17.p0;
    v13.p1 = v9;
    const std::vector<double> v31 = v4[2];
    std::vector<std::vector<double>> v46 = v15;
    const s0 v29 = v6[0];
    v10[1] = v22;
    const std::vector<std::vector<double>> v16 = v13.p0;
    v13.p1 = v11;
    std::vector<s0> v23 = v0;
    const std::vector<std::vector<double>> v24 = v3.p1;
    const s0 v19 = v5[0];
    const std::vector<std::vector<double>> v43 = v17.p1;
    const std::vector<std::vector<double>> v45 = v29.p1;
    v13.p1 = v24;
    v10[1] = v31;
    v23[0] = v3;
    v46[0] = v8;
    v13.p1 = v43;
    v6[0] = v29;
    const std::vector<std::vector<double>> v39 = v19.p1;
    const std::vector<std::vector<double>> v28 = v7.p1;
    v13.p1 = v28;
    v23[0] = v29;
    const s0 v55(v46, v39);
    const std::vector<std::vector<double>> v51 = v55.p1;
    v13.p0 = v15;
    v46[1] = v31;
    v13.p0 = v10;
    const std::vector<std::vector<double>> v34 = v17.p1;
    v13.p1 = v39;
    v13.p1 = v51;
    v13.p0 = v46;
    v13.p1 = v28;
    v13.p1 = v51;
    v6[0] = v7;
    const std::vector<double> v53 = v34[0];
    std::vector<s0> v42 = v23;
    v13.p1 = v39;
    v46[1] = v22;
    const s0 v40 = v42[0];
    v13.p1 = v45;
    v13.p0 = v16;
    v10[1] = v53;
    const std::vector<std::vector<double>> v65 = v29.p1;
    v23 = v0;
    v13.p1 = v12;
    const std::vector<double> v87 = v51[2];
    v5[0] = v40;
    const double v156 = v87[0];
    v46 = v16;
    v13.p1 = v65;
    return v156;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } } });
    double v1(5.0);
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
