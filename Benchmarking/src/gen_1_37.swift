  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v10: s1 = v0[0]
    let v13: s0 = v10.p0
    let v27: Double = v1 * v1
    let v47: [[Double]] = v13.p1
    let v69: [Double] = v47[0]
    let v63: Double = v69[0]
    let v44: Double = v27 * v63
    let v64: Double = v1 / v44
    let v147: Double = v44 + v64
    var v93: Double = v147
    return v93
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0]]), p1: [s0(p0: [[3.0], [4.0]], p1: [[5.0]]), s0(p0: [[6.0], [7.0]], p1: [[8.0]]), s0(p0: [[9.0], [10.0]], p1: [[11.0]])])]
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
