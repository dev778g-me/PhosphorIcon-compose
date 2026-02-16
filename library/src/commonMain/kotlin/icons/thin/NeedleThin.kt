package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.NeedleThin: ImageVector
    get() {
        if (_NeedleThin != null) {
            return _NeedleThin!!
        }
        _NeedleThin = ImageVector.Builder(
            name = "Thin.NeedleThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(184f, 72f)
                lineTo(168f, 88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(182.63f, 118.63f)
                lineToRelative(24f, -24f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = false, -45.26f, -45.26f)
                lineToRelative(-24f, 24f)
                curveTo(128f, 128f, 40f, 216f, 40f, 216f)
                reflectiveCurveTo(128f, 128f, 182.63f, 118.63f)
                close()
            }
        }.build()

        return _NeedleThin!!
    }

@Suppress("ObjectPropertyName")
private var _NeedleThin: ImageVector? = null
