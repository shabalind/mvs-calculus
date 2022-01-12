  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  struct s1 {
    var p0: s0
    var p1: [Double]
  }
  struct s2 {
    var p0: s1
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s2, _ v2: Double) -> Double {
    let v9: [s0] = v1.p1
    let v13: s0 = v9[0]
    let v27: [[Double]] = v13.p0
    let v14: [Double] = v27[0]
    let v28: Double = v14[0]
    let v77: [[Double]] = v13.p0
    let v167: [Double] = v77[2]
    var v108: Double = v28
    let v72: Double = v167[0]
    let v252: Double = v108 / v72
    return v252
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [3.0, 4.0, 5.0])
    let v1: s2 = s2(p0: s1(p0: s0(p0: [[6.0], [7.0], [8.0]], p1: [9.0, 10.0, 11.0]), p1: [12.0, 13.0]), p1: [s0(p0: [[14.0], [15.0], [16.0]], p1: [17.0, 18.0, 19.0])])
    let v2: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
