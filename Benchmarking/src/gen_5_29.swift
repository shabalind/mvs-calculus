  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
    var p2: [[Double]]
    var p3: [[Double]]
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s0, _ v2: [s0], _ v3: [[s0]], _ v4: s0, _ v5: s0, _ v6: s0, _ v7: Double) -> Double {
    let v9: [[Double]] = v5.p0
    var v21: [[Double]] = v9
    let v35: [Double] = v21[0]
    var v28: [Double] = v35
    let v64: Double = v28[0]
    let v68: [[Double]] = v0.p3
    let v30: [Double] = v68[0]
    v21[0] = v30
    v28[0] = v7
    let v81: [Double] = v21[0]
    v28 = v81
    return v64
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0]], p1: [[1.0]], p2: [[2.0]], p3: [[3.0]])
    let v1: s0 = s0(p0: [[4.0]], p1: [[5.0]], p2: [[6.0]], p3: [[7.0]])
    let v2: [s0] = [s0(p0: [[8.0]], p1: [[9.0]], p2: [[10.0]], p3: [[11.0]]), s0(p0: [[12.0]], p1: [[13.0]], p2: [[14.0]], p3: [[15.0]])]
    let v3: [[s0]] = [[s0(p0: [[16.0]], p1: [[17.0]], p2: [[18.0]], p3: [[19.0]])]]
    let v4: s0 = s0(p0: [[20.0]], p1: [[21.0]], p2: [[22.0]], p3: [[23.0]])
    let v5: s0 = s0(p0: [[24.0]], p1: [[25.0]], p2: [[26.0]], p3: [[27.0]])
    let v6: s0 = s0(p0: [[28.0]], p1: [[29.0]], p2: [[30.0]], p3: [[31.0]])
    let v7: Double = 32.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 32.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4, v5, v6, v7)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
