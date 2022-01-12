  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f41(_ v0: Double, _ v1: [Double]) -> [Double] {
    var v3: Double = v0
    var v20: [Double] = v1
    v3 = v0
    v20[0] = v3
    return v20
  }
  @inline(never)
  func f0(_ v0: [Double], _ v1: [s0], _ v2: Double) -> Double {
    let v3: s0 = v1[0]
    let v7: [[Double]] = v3.p0
    let v5: Double = v0[1]
    let v18: [Double] = v7[0]
    let v16: [Double] = f41(v5, v18)
    let v73: Double = v16[0]
    return v73
  }
  func benchmark() {
    let v0: [Double] = [0.0, 1.0, 2.0]
    let v1: [s0] = [s0(p0: [[3.0], [4.0], [5.0]], p1: [[6.0], [7.0], [8.0]])]
    let v2: Double = 9.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 9.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
