  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f1(const s0 &v0) {
    s0 v1 = v0;
    const std::vector<std::vector<double>> v6 = v1.p0;
    const std::vector<double> v5 = v6[1];
    std::vector<std::vector<double>> v3 = v6;
    const std::vector<std::vector<double>> v7 = v0.p0;
    const std::vector<std::vector<double>> v4 = v1.p1;
    const std::vector<std::vector<double>> v8 = v0.p1;
    const std::vector<std::vector<double>> v9 = v0.p0;
    const std::vector<std::vector<std::vector<double>>> v11 { v8, v4, v8, v8, v4, v8 };
    const std::vector<std::vector<double>> v24 = v0.p1;
    const std::vector<std::vector<double>> v14 = v11[5];
    const std::vector<double> v23 = v6[0];
    const std::vector<std::vector<double>> v20 = v11[1];
    const std::vector<std::vector<double>> v35 = v1.p0;
    std::vector<std::vector<double>> v39 = v35;
    std::vector<std::vector<double>> v37 = v39;
    const s0 v58(v9, v14);
    v1.p1 = v24;
    v1.p1 = v4;
    const std::vector<double> v34 = v9[1];
    s0 v47 = v0;
    const std::vector<std::vector<double>> v25 = v58.p1;
    const std::vector<std::vector<double>> v62 = v0.p0;
    const std::vector<std::vector<double>> v86 = v47.p0;
    v3[0] = v23;
    std::vector<std::vector<double>> v19 = v86;
    s0 v57 = v1;
    s0 v63 = v1;
    v1.p0 = v19;
    v63.p0 = v6;
    const std::vector<std::vector<double>> v32 = v58.p1;
    v57.p0 = v7;
    v37[0] = v34;
    v57.p0 = v3;
    v1.p1 = v25;
    const std::vector<std::vector<double>> v31 = v11[1];
    const std::vector<std::vector<double>> v33 = v63.p1;
    const s0 v75(v39, v14);
    v1.p0 = v7;
    const std::vector<std::vector<double>> v43 = v57.p0;
    const std::vector<std::vector<double>> v214 = v63.p1;
    v63.p0 = v19;
    v1.p0 = v62;
    v47.p1 = v31;
    s0 v68 = v57;
    const std::vector<double> v95 = v32[0];
    const std::vector<std::vector<double>> v60 = v1.p1;
    v57.p0 = v6;
    v3[1] = v5;
    v68.p1 = v214;
    v57 = v75;
    v68.p0 = v43;
    v3[0] = v95;
    v57.p0 = v37;
    v1.p1 = v33;
    v57.p1 = v60;
    v47.p1 = v20;
    v68.p1 = v20;
    return v68;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const s0 v5 = f1(v0);
    const std::vector<std::vector<double>> v11 = v5.p0;
    const std::vector<std::vector<double>> v13 = v5.p0;
    std::vector<std::vector<double>> v20 = v11;
    const std::vector<double> v34 = v20[0];
    v20 = v13;
    const double v59 = v34[0];
    return v59;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 } } });
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
