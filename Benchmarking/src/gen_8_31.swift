  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s2 {
    var p0: [[s0]]
    var p1: [[s0]]
  }
  @inline(never)
  func f0(_ v0: s2, _ v1: [[s2]], _ v2: Double) -> Double {
    let v5: [s2] = v1[2]
    let v12: s2 = v5[0]
    let v15: [[s0]] = v12.p1
    let v14: [s0] = v15[0]
    let v33: [s0] = v15[0]
    var v21: [s0] = v33
    v21 = v14
    let v48: s0 = v21[0]
    let v31: [[Double]] = v48.p1
    let v108: [Double] = v31[0]
    let v132: Double = v108[0]
    return v132
  }
  func benchmark() {
    let v0: s2 = s2(p0: [[s0(p0: [[0.0], [1.0]], p1: [[2.0]])]], p1: [[s0(p0: [[3.0], [4.0]], p1: [[5.0]])], [s0(p0: [[6.0], [7.0]], p1: [[8.0]])]])
    let v1: [[s2]] = [[s2(p0: [[s0(p0: [[9.0], [10.0]], p1: [[11.0]])]], p1: [[s0(p0: [[12.0], [13.0]], p1: [[14.0]])], [s0(p0: [[15.0], [16.0]], p1: [[17.0]])]])], [s2(p0: [[s0(p0: [[18.0], [19.0]], p1: [[20.0]])]], p1: [[s0(p0: [[21.0], [22.0]], p1: [[23.0]])], [s0(p0: [[24.0], [25.0]], p1: [[26.0]])]])], [s2(p0: [[s0(p0: [[27.0], [28.0]], p1: [[29.0]])]], p1: [[s0(p0: [[30.0], [31.0]], p1: [[32.0]])], [s0(p0: [[33.0], [34.0]], p1: [[35.0]])]])]]
    let v2: Double = 36.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 36.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
