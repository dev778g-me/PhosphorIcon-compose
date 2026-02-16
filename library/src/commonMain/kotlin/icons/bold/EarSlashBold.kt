package icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Bold.EarSlashBold: ImageVector
    get() {
        if (_EarSlashBold != null) {
            return _EarSlashBold!!
        }
        _EarSlashBold = ImageVector.Builder(
            name = "Bold.EarSlashBold",
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
                moveTo(48f, 40f)
                lineTo(208f, 216f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 216f)
                curveToRelative(-8.07f, 9.77f, -18.34f, 16f, -32f, 16f)
                arcToRelative(44f, 44f, 0f, isMoreThanHalf = false, isPositiveArc = true, -44f, -44f)
                curveToRelative(0f, -41.49f, -36f, -28f, -36f, -84f)
                arcTo(79.63f, 79.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 63.34f, 56.88f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(91.43f, 87.77f)
                arcTo(39.76f, 39.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 88f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(169.07f, 173.18f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 144f, 160f)
                arcToRelative(33.16f, 33.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.2f, -12f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(94.27f, 31.44f)
                arcTo(80f, 80f, 0f, isMoreThanHalf = false, isPositiveArc = true, 208f, 104f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(167.14f, 111.59f)
                arcTo(33.15f, 33.15f, 0f, isMoreThanHalf = false, isPositiveArc = false, 168f, 104f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, -40f, -40f)
                curveToRelative(-1.33f, 0f, -2.65f, 0.07f, -4f, 0.19f)
            }
        }.build()

        return _EarSlashBold!!
    }

@Suppress("ObjectPropertyName")
private var _EarSlashBold: ImageVector? = null
