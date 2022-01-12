  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f20(const s0 &v0) {
    s0 v5 = v0;
    const std::vector<std::vector<double>> v7 = v5.p1;
    const std::vector<std::vector<double>> v2 = v0.p0;
    const std::vector<std::vector<double>> v4 = v0.p0;
    const s0 v13(v2, v7);
    s0 v10 = v0;
    v10.p1 = v7;
    v10.p0 = v4;
    const std::vector<double> v42 = v7[0];
    v5.p0 = v2;
    v5.p0 = v2;
    std::vector<std::vector<double>> v35 = v7;
    const std::vector<std::vector<double>> v23 = v13.p1;
    const std::vector<double> v28 = v35[0];
    v5.p1 = v35;
    v35[1] = v42;
    const std::vector<double> v18 = v2[0];
    v10.p1 = v23;
    std::vector<double> v20 = v28;
    const std::vector<std::vector<double>> v48 = v10.p0;
    v10.p1 = v35;
    v35[0] = v20;
    v10.p0 = v4;
    const std::vector<double> v33 = v48[0];
    v35[1] = v18;
    std::vector<double> v61 = v33;
    v35[0] = v61;
    return v10;
  }
  s0 f9(const s0 &v0) {
    const s0 v8 = f20(v0);
    const s0 v13 = f20(v8);
    const s0 v10 = f20(v13);
    return v10;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const std::vector<std::vector<double>> v3 = v0.p1;
    const std::vector<std::vector<double>> v5 = v0.p1;
    s0 v6 = v0;
    v6.p1 = v3;
    const std::vector<std::vector<double>> v11 = v6.p1;
    const s0 v14 = f9(v6);
    std::vector<std::vector<double>> v9 = v5;
    const s0 v17 = f20(v14);
    v6.p1 = v11;
    const std::vector<std::vector<double>> v26 = v17.p0;
    s0 v21 = v17;
    const s0 v34 = f20(v14);
    const s0 v19 = f20(v14);
    const std::vector<double> v23 = v26[1];
    const std::vector<double> v42 = v26[2];
    v6.p1 = v9;
    v9[0] = v23;
    s0 v22 = v34;
    v6.p1 = v9;
    const std::vector<std::vector<double>> v33 = v21.p1;
    const double v53 = v42[0];
    v6.p1 = v9;
    v6.p1 = v33;
    const std::vector<std::vector<double>> v51 = v14.p0;
    v21.p0 = v51;
    const double v58 = v53 + v53;
    const std::vector<std::vector<double>> v115 = v19.p0;
    v6.p1 = v33;
    v21.p0 = v115;
    const std::vector<std::vector<double>> v174 = v22.p0;
    v21.p0 = v174;
    return v58;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } } });
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
