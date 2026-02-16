package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.MapPinSimpleAreaThin: ImageVector
    get() {
        if (_MapPinSimpleAreaThin != null) {
            return _MapPinSimpleAreaThin!!
        }
        _MapPinSimpleAreaThin = ImageVector.Builder(
            name = "Thin.MapPinSimpleAreaThin",
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
                moveTo(128f, 64f)
                moveToRelative(-32f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 64f, 0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -64f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 96f)
                lineTo(128f, 176f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(168f, 139.07f)
                curveToRelative(37.58f, 6f, 64f, 20.29f, 64f, 36.93f)
                curveToRelative(0f, 22.09f, -46.56f, 40f, -104f, 40f)
                reflectiveCurveTo(24f, 198.09f, 24f, 176f)
                curveToRelative(0f, -16.64f, 26.42f, -30.91f, 64f, -36.93f)
            }
        }.build()

        return _MapPinSimpleAreaThin!!
    }

@Suppress("ObjectPropertyName")
private var _MapPinSimpleAreaThin: ImageVector? = null
