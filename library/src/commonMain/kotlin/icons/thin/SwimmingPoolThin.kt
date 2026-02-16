package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.SwimmingPoolThin: ImageVector
    get() {
        if (_SwimmingPoolThin != null) {
            return _SwimmingPoolThin!!
        }
        _SwimmingPoolThin = ImageVector.Builder(
            name = "Thin.SwimmingPoolThin",
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
                moveTo(88f, 56f)
                lineTo(168f, 56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 88f)
                lineTo(168f, 88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 120f)
                lineTo(168f, 120f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(88f, 32f)
                lineTo(88f, 141.39f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 32f)
                lineTo(168f, 143.29f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 168f)
                curveToRelative(24f, 0f, 24f, 16f, 48f, 16f)
                reflectiveCurveToRelative(24f, -16f, 48f, -16f)
                reflectiveCurveToRelative(24f, 16f, 48f, 16f)
                reflectiveCurveToRelative(24f, -16f, 48f, -16f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 208f)
                curveToRelative(24f, 0f, 24f, 16f, 48f, 16f)
                reflectiveCurveToRelative(24f, -16f, 48f, -16f)
                reflectiveCurveToRelative(24f, 16f, 48f, 16f)
                reflectiveCurveToRelative(24f, -16f, 48f, -16f)
            }
        }.build()

        return _SwimmingPoolThin!!
    }

@Suppress("ObjectPropertyName")
private var _SwimmingPoolThin: ImageVector? = null
