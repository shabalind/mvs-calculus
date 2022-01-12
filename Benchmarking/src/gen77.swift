  import Dispatch
  struct s0 {
    var p0: Double
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [Double], _ v1: [[s1]], _ v2: s0, _ v3: Double) -> Double {
    var v7: [Double] = v0
    v7[0] = v3
    var v4: Double = v3
    v7[0] = v4
    v7[0] = v4
    v7[0] = v4
    var v6: [Double] = v7
    let v12: Double = v2.p0
    let v5: [[Double]] = v2.p1
    let v21: [[[Double]]] = [v5, v5, v5, v5]
    let v19: [[Double]] = v21[2]
    let v23: Double = v0[0]
    v6[0] = v4
    v6[0] = v23
    let v56: [Double] = v19[0]
    v6[0] = v23
    let v42: Double = v12 / v3
    var v37: [Double] = v56
    v37 = v6
    let v194: Double = v37[0]
    v37[0] = v42
    return v194
  }
  func benchmark() {
    let v0: [Double] = [0.0]
    let v1: [[s1]] = [[s1(p0: s0(p0: 1.0, p1: [[2.0], [3.0], [4.0]]), p1: [s0(p0: 5.0, p1: [[6.0], [7.0], [8.0]])])]]
    let v2: s0 = s0(p0: 9.0, p1: [[10.0], [11.0], [12.0]])
    let v3: Double = 13.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 13.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
