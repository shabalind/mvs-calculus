  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f80(const s0 &v0) {
    const std::vector<std::vector<double>> v1 = v0.p1;
    const std::vector<std::vector<double>> v5 = v0.p0;
    std::vector<std::vector<double>> v2 = v5;
    const s0 v4(v2, v1);
    const std::vector<std::vector<double>> v9 = v4.p0;
    v2 = v5;
    const std::vector<double> v11 = v9[0];
    v2[0] = v11;
    v2 = v9;
    const std::vector<std::vector<double>> v22 = v4.p1;
    const s0 v41(v9, v22);
    return v41;
  }
  s0 f73(const s0 &v0) {
    const s0 v5 = f80(v0);
    const std::vector<std::vector<double>> v3 = v5.p0;
    const std::vector<std::vector<double>> v4 = v0.p0;
    const s0 v1 = f80(v0);
    const std::vector<std::vector<double>> v8 = v5.p1;
    const s0 v7 = f80(v0);
    s0 v10 = v1;
    const std::vector<std::vector<double>> v12 = v10.p1;
    v10.p0 = v4;
    const std::vector<std::vector<double>> v27 = v0.p1;
    const std::vector<std::vector<double>> v16 = v0.p1;
    v10.p1 = v8;
    const s0 v26 = f80(v7);
    v10.p1 = v16;
    const s0 v44 = f80(v10);
    const std::vector<std::vector<double>> v59 = v44.p0;
    const s0 v43 = f80(v26);
    v10.p0 = v59;
    const std::vector<std::vector<double>> v36 = v43.p0;
    const s0 v39 = f80(v43);
    const s0 v45(v36, v16);
    v10.p1 = v12;
    v10.p0 = v36;
    v10.p0 = v3;
    const std::vector<std::vector<double>> v53 = v39.p0;
    v10.p1 = v16;
    const s0 v126 = f80(v44);
    v10.p0 = v53;
    v10.p1 = v27;
    v10.p0 = v53;
    v10.p0 = v53;
    const s0 v98 = f80(v126);
    const std::vector<std::vector<double>> v65 = v45.p1;
    v10.p1 = v65;
    v10.p0 = v59;
    const s0 v105 = f80(v98);
    return v105;
  }
  s0 f65(const s0 &v0) {
    s0 v1 = v0;
    s0 v3 = v1;
    const std::vector<std::vector<double>> v2 = v1.p1;
    v3.p1 = v2;
    return v3;
  }
  s0 f35(const s0 &v0) {
    const s0 v3 = f65(v0);
    s0 v5 = v0;
    s0 v6 = v5;
    const s0 v1 = f73(v5);
    const std::vector<std::vector<double>> v2 = v1.p1;
    const s0 v25 = f80(v3);
    s0 v11 = v25;
    s0 v22 = v6;
    std::vector<std::vector<double>> v36 = v2;
    v5.p1 = v2;
    v5 = v1;
    const s0 v17 = f80(v11);
    v11.p1 = v2;
    v5.p1 = v36;
    const std::vector<std::vector<double>> v34 = v22.p1;
    v11.p1 = v34;
    const std::vector<std::vector<double>> v33 = v17.p0;
    const std::vector<std::vector<double>> v37 = v0.p0;
    std::vector<std::vector<double>> v20 = v33;
    const s0 v69 = f65(v1);
    v5.p0 = v33;
    v6.p0 = v20;
    v36 = v34;
    std::vector<std::vector<double>> v48 = v37;
    v22.p0 = v48;
    return v69;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    s0 v8 = v0;
    s0 v2 = v0;
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<std::vector<double>> v6 = v8.p1;
    const s0 v14 = f35(v2);
    v2.p1 = v6;
    v8.p0 = v4;
    const s0 v42 = f73(v14);
    const std::vector<std::vector<double>> v52 = v42.p1;
    const std::vector<double> v44 = v52[0];
    const double v69 = v44[0];
    double v71 = v69;
    return v71;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } });
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
