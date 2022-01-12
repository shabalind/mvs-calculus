  import Dispatch
  struct s0 {
    var p0: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v3: [Double] = [v1, v1, v1, v1, v1]
    var v7: [Double] = v3
    let v5: Double = v1 - v1
    v7[2] = v1
    let v9: Double = v7[3]
    var v6: [Double] = v7
    let v13: Double = v5 - v9
    let v15: Double = v13 + v13
    v7[3] = v1
    v7[2] = v1
    v7 = v3
    v6[3] = v5
    var v28: Double = v15
    v6[2] = v5
    v7 = v6
    return v28
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0], [2.0]]), p1: s0(p0: [[3.0], [4.0], [5.0]])), s1(p0: s0(p0: [[6.0], [7.0], [8.0]]), p1: s0(p0: [[9.0], [10.0], [11.0]]))]
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
