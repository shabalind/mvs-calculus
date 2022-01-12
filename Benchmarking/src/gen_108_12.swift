  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  struct s2 {
    var p0: s1
    var p1: [s0]
    var p2: s0
    var p3: s1
    var p4: s0
  }
  struct s3 {
    var p0: s0
    var p1: [[s2]]
  }
  struct s5 {
    var p0: [s3]
    var p1: s3
  }
  func f80(_ v0: s5) -> s5 {
    let v4: s3 = v0.p1
    var v5: s5 = v0
    v5.p1 = v4
    var v16: s5 = v5
    return v16
  }
  func f66(_ v0: Double) -> Double {
    var v7: Double = v0
    v7 = v0
    var v5: Double = v7
    var v6: Double = v0
    v6 = v5
    v5 = v7
    var v4: Double = v0
    let v1: Double = v0 - v4
    var v9: Double = v6
    var v3: Double = v5
    var v15: Double = v0
    var v22: Double = v1
    var v21: Double = v3
    let v39: [Double] = [v7, v5, v5, v22, v3, v5, v21]
    var v20: Double = v15
    let v11: Double = v39[4]
    var v50: [Double] = v39
    var v80: [Double] = v50
    v50[3] = v20
    let v26: Double = v80[5]
    let v31: Double = v80[4]
    v80[2] = v11
    let v54: Double = v26 - v21
    var v64: Double = v54
    v80[4] = v11
    var v75: [Double] = v39
    v80[4] = v31
    v50 = v75
    v80[5] = v3
    v50[1] = v9
    v80[4] = v3
    v50[0] = v6
    return v64
  }
  @inline(never)
  func f0(_ v0: [s5], _ v1: Double) -> Double {
    let v8: s5 = v0[1]
    let v7: [s3] = v8.p0
    let v18: s5 = f80(v8)
    let v12: s3 = v18.p1
    let v19: [[s2]] = v12.p1
    var v32: s3 = v12
    let v30: s0 = v32.p0
    v32.p1 = v19
    let v41: Double = f66(v1)
    let v51: [[Double]] = v30.p1
    let v33: [[s2]] = v32.p1
    let v29: [Double] = v51[0]
    v32.p0 = v30
    let v37: s3 = v7[1]
    var v27: [Double] = v29
    v32.p1 = v33
    v27[0] = v41
    let v82: [[s2]] = v37.p1
    v32.p1 = v82
    let v167: Double = v27[0]
    return v167
  }
  func benchmark() {
    let v0: [s5] = [s5(p0: [s3(p0: s0(p0: 0.0, p1: [[1.0]]), p1: [[s2(p0: s1(p0: [s0(p0: 2.0, p1: [[3.0]]), s0(p0: 4.0, p1: [[5.0]]), s0(p0: 6.0, p1: [[7.0]])], p1: [s0(p0: 8.0, p1: [[9.0]])]), p1: [s0(p0: 10.0, p1: [[11.0]]), s0(p0: 12.0, p1: [[13.0]])], p2: s0(p0: 14.0, p1: [[15.0]]), p3: s1(p0: [s0(p0: 16.0, p1: [[17.0]]), s0(p0: 18.0, p1: [[19.0]]), s0(p0: 20.0, p1: [[21.0]])], p1: [s0(p0: 22.0, p1: [[23.0]])]), p4: s0(p0: 24.0, p1: [[25.0]]))]]), s3(p0: s0(p0: 26.0, p1: [[27.0]]), p1: [[s2(p0: s1(p0: [s0(p0: 28.0, p1: [[29.0]]), s0(p0: 30.0, p1: [[31.0]]), s0(p0: 32.0, p1: [[33.0]])], p1: [s0(p0: 34.0, p1: [[35.0]])]), p1: [s0(p0: 36.0, p1: [[37.0]]), s0(p0: 38.0, p1: [[39.0]])], p2: s0(p0: 40.0, p1: [[41.0]]), p3: s1(p0: [s0(p0: 42.0, p1: [[43.0]]), s0(p0: 44.0, p1: [[45.0]]), s0(p0: 46.0, p1: [[47.0]])], p1: [s0(p0: 48.0, p1: [[49.0]])]), p4: s0(p0: 50.0, p1: [[51.0]]))]])], p1: s3(p0: s0(p0: 52.0, p1: [[53.0]]), p1: [[s2(p0: s1(p0: [s0(p0: 54.0, p1: [[55.0]]), s0(p0: 56.0, p1: [[57.0]]), s0(p0: 58.0, p1: [[59.0]])], p1: [s0(p0: 60.0, p1: [[61.0]])]), p1: [s0(p0: 62.0, p1: [[63.0]]), s0(p0: 64.0, p1: [[65.0]])], p2: s0(p0: 66.0, p1: [[67.0]]), p3: s1(p0: [s0(p0: 68.0, p1: [[69.0]]), s0(p0: 70.0, p1: [[71.0]]), s0(p0: 72.0, p1: [[73.0]])], p1: [s0(p0: 74.0, p1: [[75.0]])]), p4: s0(p0: 76.0, p1: [[77.0]]))]])), s5(p0: [s3(p0: s0(p0: 78.0, p1: [[79.0]]), p1: [[s2(p0: s1(p0: [s0(p0: 80.0, p1: [[81.0]]), s0(p0: 82.0, p1: [[83.0]]), s0(p0: 84.0, p1: [[85.0]])], p1: [s0(p0: 86.0, p1: [[87.0]])]), p1: [s0(p0: 88.0, p1: [[89.0]]), s0(p0: 90.0, p1: [[91.0]])], p2: s0(p0: 92.0, p1: [[93.0]]), p3: s1(p0: [s0(p0: 94.0, p1: [[95.0]]), s0(p0: 96.0, p1: [[97.0]]), s0(p0: 98.0, p1: [[99.0]])], p1: [s0(p0: 100.0, p1: [[101.0]])]), p4: s0(p0: 102.0, p1: [[103.0]]))]]), s3(p0: s0(p0: 104.0, p1: [[105.0]]), p1: [[s2(p0: s1(p0: [s0(p0: 106.0, p1: [[107.0]]), s0(p0: 108.0, p1: [[109.0]]), s0(p0: 110.0, p1: [[111.0]])], p1: [s0(p0: 112.0, p1: [[113.0]])]), p1: [s0(p0: 114.0, p1: [[115.0]]), s0(p0: 116.0, p1: [[117.0]])], p2: s0(p0: 118.0, p1: [[119.0]]), p3: s1(p0: [s0(p0: 120.0, p1: [[121.0]]), s0(p0: 122.0, p1: [[123.0]]), s0(p0: 124.0, p1: [[125.0]])], p1: [s0(p0: 126.0, p1: [[127.0]])]), p4: s0(p0: 128.0, p1: [[129.0]]))]])], p1: s3(p0: s0(p0: 130.0, p1: [[131.0]]), p1: [[s2(p0: s1(p0: [s0(p0: 132.0, p1: [[133.0]]), s0(p0: 134.0, p1: [[135.0]]), s0(p0: 136.0, p1: [[137.0]])], p1: [s0(p0: 138.0, p1: [[139.0]])]), p1: [s0(p0: 140.0, p1: [[141.0]]), s0(p0: 142.0, p1: [[143.0]])], p2: s0(p0: 144.0, p1: [[145.0]]), p3: s1(p0: [s0(p0: 146.0, p1: [[147.0]]), s0(p0: 148.0, p1: [[149.0]]), s0(p0: 150.0, p1: [[151.0]])], p1: [s0(p0: 152.0, p1: [[153.0]])]), p4: s0(p0: 154.0, p1: [[155.0]]))]]))]
    let v1: Double = 156.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 156.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
