package icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Duotone.BeachBallDuotone: ImageVector
    get() {
        if (_BeachBallDuotone != null) {
            return _BeachBallDuotone!!
        }
        _BeachBallDuotone = ImageVector.Builder(
            name = "Duotone.BeachBallDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(79.26f, 45.27f)
                arcToRelative(96.4f, 96.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 68.68f, -11.2f)
                arcToRelative(191.91f, 191.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.29f, 59.29f)
                arcTo(191.07f, 191.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 79.26f, 45.27f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(210.73f, 176.73f)
                arcToRelative(191f, 191f, 0f, isMoreThanHalf = false, isPositiveArc = false, -48.09f, -82f)
                arcToRelative(192.2f, 192.2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 59.29f, 13.29f)
                arcToRelative(96.37f, 96.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.2f, 68.67f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(161.31f, 94.69f)
                arcToRelative(191.56f, 191.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -40.5f, 129f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -88.54f, -88.54f)
                arcTo(191.56f, 191.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 161.31f, 94.69f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(147.93f, 34.08f)
                arcToRelative(192.17f, 192.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -27.12f, 189.65f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32.27f, 135.19f)
                arcToRelative(192.17f, 192.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 189.65f, -27.12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(79.25f, 45.27f)
                arcToRelative(191.14f, 191.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 82.69f, 48.79f)
                arcToRelative(191.14f, 191.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48.79f, 82.69f)
            }
        }.build()

        return _BeachBallDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _BeachBallDuotone: ImageVector? = null
