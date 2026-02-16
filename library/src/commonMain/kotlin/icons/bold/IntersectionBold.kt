package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.IntersectionBold: ImageVector
    get() {
        if (_IntersectionBold != null) {
            return _IntersectionBold!!
        }
        _IntersectionBold = ImageVector.Builder(
            name = "Bold.IntersectionBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(56f, 200f)
                verticalLineTo(120f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 0f)
                verticalLineToRelative(80f)
            }
        }.build()

        return _IntersectionBold!!
    }

@Suppress("ObjectPropertyName")
private var _IntersectionBold: ImageVector? = null
