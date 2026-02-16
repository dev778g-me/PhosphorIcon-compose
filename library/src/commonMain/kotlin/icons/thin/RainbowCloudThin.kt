package icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Thin.RainbowCloudThin: ImageVector
    get() {
        if (_RainbowCloudThin != null) {
            return _RainbowCloudThin!!
        }
        _RainbowCloudThin = ImageVector.Builder(
            name = "Thin.RainbowCloudThin",
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
                moveTo(152f, 200f)
                curveToRelative(-13.25f, 0f, -24f, -11.14f, -24f, -24.89f)
                reflectiveCurveToRelative(10.75f, -24.89f, 24f, -24.89f)
                arcToRelative(23.33f, 23.33f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.81f, 1.73f)
                horizontalLineToRelative(0f)
                arcTo(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 200f, 200f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 176f)
                verticalLineTo(160f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 178.93f, 91.17f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48f, 176f)
                verticalLineTo(160f)
                arcToRelative(64f, 64f, 0f, isMoreThanHalf = false, isPositiveArc = true, 101.87f, -51.6f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 176f)
                verticalLineTo(160f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 39.42f, -31.13f)
            }
        }.build()

        return _RainbowCloudThin!!
    }

@Suppress("ObjectPropertyName")
private var _RainbowCloudThin: ImageVector? = null
