  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: [s0], _ v2: Double) -> Double {
    let v9: s0 = v1[0]
    let v5: [[Double]] = v9.p1
    var v14: [[Double]] = v5
    let v17: [Double] = v14[2]
    var v16: [[Double]] = v14
    let v41: Double = v17[0]
    let v35: Double = v41 / v2
    v16[1] = v17
    let v56: Double = v35 / v35
    let v64: [Double] = v16[0]
    v14[1] = v64
    return v56
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])]
    let v1: [s0] = [s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0], [16.0], [17.0]]), s0(p0: [[18.0], [19.0], [20.0]], p1: [[21.0], [22.0], [23.0]])]
    let v2: Double = 24.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 24.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
