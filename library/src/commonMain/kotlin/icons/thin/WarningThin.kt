package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.WarningThin: ImageVector
    get() {
        if (_WarningThin != null) {
            return _WarningThin!!
        }
        _WarningThin = ImageVector.Builder(
            name = "Thin.WarningThin",
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
                moveTo(142.41f, 40.22f)
                lineToRelative(87.46f, 151.87f)
                curveTo(236f, 202.79f, 228.08f, 216f, 215.46f, 216f)
                horizontalLineTo(40.54f)
                curveTo(27.92f, 216f, 20f, 202.79f, 26.13f, 192.09f)
                lineTo(113.59f, 40.22f)
                curveTo(119.89f, 29.26f, 136.11f, 29.26f, 142.41f, 40.22f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 144f)
                lineTo(128f, 104f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 180f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 0f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -16f, 0f)
            }
        }.build()

        return _WarningThin!!
    }

@Suppress("ObjectPropertyName")
private var _WarningThin: ImageVector? = null
