  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  func f29(_ v0: [s1]) -> [s1] {
    var v7: [s1] = v0
    return v7
  }
  func f23(_ v0: [s1]) -> [s1] {
    let v7: [s1] = f29(v0)
    let v1: s1 = v7[0]
    var v15: [s1] = v7
    v15[0] = v1
    var v50: [s1] = v15
    v15 = v50
    return v15
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v7: [s1] = f23(v0)
    let v2: s1 = v7[0]
    let v8: [s0] = v2.p0
    let v5: s0 = v8[1]
    let v9: Double = v1 / v1
    let v10: [[Double]] = v5.p1
    let v18: [Double] = v10[2]
    let v27: Double = v18[0]
    let v146: Double = v9 + v27
    return v146
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0], [3.0]]), s0(p0: [[4.0]], p1: [[5.0], [6.0], [7.0]]), s0(p0: [[8.0]], p1: [[9.0], [10.0], [11.0]])], p1: s0(p0: [[12.0]], p1: [[13.0], [14.0], [15.0]]))]
    let v1: Double = 16.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 16.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
