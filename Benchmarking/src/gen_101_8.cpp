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
    s0 p1;
    s0 p2;
    std::vector<s0> p3;
    s0 p4;
    s0 p5;
    s1(s0 v0, s0 v1, s0 v2, std::vector<s0> v3, s0 v4, s0 v5): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5) { }
  };
  struct s3 {
    s1 p0;
    s1 p1;
    s3(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    std::vector<std::vector<s3>> p1;
    s4(s0 v0, std::vector<std::vector<s3>> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s0 p0;
    s0 p1;
    s5(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s11 {
    s5 p0;
    s4 p1;
    s11(s5 v0, s4 v1): p0(v0), p1(v1) { }
  };
  s4 f18(const s4 &v0) {
    const s0 v7 = v0.p0;
    const std::vector<std::vector<s3>> v4 = v0.p1;
    const std::vector<s0> v1 { v7, v7 };
    const s0 v8 = v1[0];
    std::vector<std::vector<s3>> v3 = v4;
    s0 v5 = v8;
    std::vector<s0> v15 = v1;
    v15[0] = v5;
    s0 v9 = v5;
    const std::vector<std::vector<double>> v11 = v9.p0;
    s4 v17 = v0;
    v15[1] = v8;
    std::vector<s0> v16 = v15;
    const std::vector<std::vector<double>> v14 = v9.p1;
    s0 v18 = v9;
    v16[0] = v18;
    const s0 v21 = v15[1];
    v5.p0 = v11;
    const std::vector<std::vector<double>> v19 = v21.p0;
    v5.p1 = v14;
    const std::vector<std::vector<double>> v23 = v9.p1;
    v15[1] = v9;
    v9.p1 = v23;
    v5.p1 = v14;
    v17.p1 = v3;
    const s0 v38 = v16[0];
    v15[1] = v38;
    const s0 v65(v19, v23);
    std::vector<std::vector<double>> v105 = v11;
    v17.p0 = v21;
    v17.p0 = v65;
    v5.p0 = v105;
    return v17;
  }
  s11 f17(const s11 &v0) {
    s11 v2 = v0;
    s11 v6 = v2;
    s11 v1 = v6;
    const s4 v3 = v0.p1;
    const s4 v7 = v1.p1;
    s4 v8 = v3;
    s4 v9 = v8;
    const s4 v17 = v2.p1;
    s11 v4 = v1;
    s4 v10 = v17;
    const s4 v21 = f18(v9);
    v2.p1 = v21;
    const std::vector<std::vector<s3>> v25 = v10.p1;
    const std::vector<s11> v12 { v2, v4, v1 };
    const s0 v15 = v8.p0;
    v4.p1 = v7;
    const s11 v41 = v12[2];
    v10.p0 = v15;
    v9.p1 = v25;
    const std::vector<std::vector<s3>> v71 = v8.p1;
    const s11 v98 = v12[1];
    const s4 v33 = f18(v8);
    s11 v51 = v41;
    v4 = v98;
    const s4 v83 = f18(v9);
    v1.p1 = v83;
    v51.p1 = v33;
    v8.p1 = v71;
    return v51;
  }
  __attribute__((noinline))
  double f0(const s11 &v0, const double &v1) {
    const s11 v2 = f17(v0);
    const s11 v7 = f17(v2);
    const s5 v6 = v7.p0;
    s5 v4 = v6;
    const s0 v12 = v4.p1;
    s0 v21 = v12;
    v4 = v6;
    v4.p0 = v12;
    const std::vector<std::vector<double>> v29 = v12.p0;
    v21.p0 = v29;
    const std::vector<double> v33 = v29[1];
    std::vector<double> v41 = v33;
    const double v40 = v33[0];
    const std::vector<std::vector<double>> v80 { v33, v41 };
    v41[0] = v40;
    const std::vector<double> v55 { v40, v40 };
    const double v30 = v55[0];
    v4.p1 = v21;
    const double v45 = v55[1];
    v21.p0 = v80;
    const double v71 = v30 + v45;
    return v71;
  }
  int main() {
    s11 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } }, { { { { { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } }, { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } }, { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } } }, { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } }, { { { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } } }, { { { { 50.0 }, { 51.0 } }, { { 52.0 }, { 53.0 }, { 54.0 } } }, { { { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 }, { 64.0 } } }, { { { { 65.0 }, { 66.0 } }, { { 67.0 }, { 68.0 }, { 69.0 } } }, { { { 70.0 }, { 71.0 } }, { { 72.0 }, { 73.0 }, { 74.0 } } } }, { { { 75.0 }, { 76.0 } }, { { 77.0 }, { 78.0 }, { 79.0 } } }, { { { 80.0 }, { 81.0 } }, { { 82.0 }, { 83.0 }, { 84.0 } } } } } }, { { { { { { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } } }, { { { 90.0 }, { 91.0 } }, { { 92.0 }, { 93.0 }, { 94.0 } } }, { { { 95.0 }, { 96.0 } }, { { 97.0 }, { 98.0 }, { 99.0 } } }, { { { { 100.0 }, { 101.0 } }, { { 102.0 }, { 103.0 }, { 104.0 } } }, { { { 105.0 }, { 106.0 } }, { { 107.0 }, { 108.0 }, { 109.0 } } } }, { { { 110.0 }, { 111.0 } }, { { 112.0 }, { 113.0 }, { 114.0 } } }, { { { 115.0 }, { 116.0 } }, { { 117.0 }, { 118.0 }, { 119.0 } } } }, { { { { 120.0 }, { 121.0 } }, { { 122.0 }, { 123.0 }, { 124.0 } } }, { { { 125.0 }, { 126.0 } }, { { 127.0 }, { 128.0 }, { 129.0 } } }, { { { 130.0 }, { 131.0 } }, { { 132.0 }, { 133.0 }, { 134.0 } } }, { { { { 135.0 }, { 136.0 } }, { { 137.0 }, { 138.0 }, { 139.0 } } }, { { { 140.0 }, { 141.0 } }, { { 142.0 }, { 143.0 }, { 144.0 } } } }, { { { 145.0 }, { 146.0 } }, { { 147.0 }, { 148.0 }, { 149.0 } } }, { { { 150.0 }, { 151.0 } }, { { 152.0 }, { 153.0 }, { 154.0 } } } } } }, { { { { { { 155.0 }, { 156.0 } }, { { 157.0 }, { 158.0 }, { 159.0 } } }, { { { 160.0 }, { 161.0 } }, { { 162.0 }, { 163.0 }, { 164.0 } } }, { { { 165.0 }, { 166.0 } }, { { 167.0 }, { 168.0 }, { 169.0 } } }, { { { { 170.0 }, { 171.0 } }, { { 172.0 }, { 173.0 }, { 174.0 } } }, { { { 175.0 }, { 176.0 } }, { { 177.0 }, { 178.0 }, { 179.0 } } } }, { { { 180.0 }, { 181.0 } }, { { 182.0 }, { 183.0 }, { 184.0 } } }, { { { 185.0 }, { 186.0 } }, { { 187.0 }, { 188.0 }, { 189.0 } } } }, { { { { 190.0 }, { 191.0 } }, { { 192.0 }, { 193.0 }, { 194.0 } } }, { { { 195.0 }, { 196.0 } }, { { 197.0 }, { 198.0 }, { 199.0 } } }, { { { 200.0 }, { 201.0 } }, { { 202.0 }, { 203.0 }, { 204.0 } } }, { { { { 205.0 }, { 206.0 } }, { { 207.0 }, { 208.0 }, { 209.0 } } }, { { { 210.0 }, { 211.0 } }, { { 212.0 }, { 213.0 }, { 214.0 } } } }, { { { 215.0 }, { 216.0 } }, { { 217.0 }, { 218.0 }, { 219.0 } } }, { { { 220.0 }, { 221.0 } }, { { 222.0 }, { 223.0 }, { 224.0 } } } } } } } } });
    double v1(225.0);
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
