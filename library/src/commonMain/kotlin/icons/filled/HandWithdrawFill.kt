package icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import icons.PhIcons

val PhIcons.Filled.HandWithdrawFill: ImageVector
    get() {
        if (_HandWithdrawFill != null) {
            return _HandWithdrawFill!!
        }
        _HandWithdrawFill = ImageVector.Builder(
            name = "Filled.HandWithdrawFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 56f)
                lineTo(112f, 56f)
                lineTo(112f, 16f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 0f)
                close()
                moveTo(192f, 123.62f)
                lineTo(192f, 72f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16f, -16f)
                lineTo(128f, 56f)
                verticalLineToRelative(60.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 11.32f)
                lineToRelative(-32f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, 0f)
                lineToRelative(-32f, -32f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 93.66f, 98.34f)
                lineTo(112f, 116.69f)
                lineTo(112f, 56f)
                lineTo(64f, 56f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, 72f)
                lineTo(48f, 200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineToRelative(74.7f)
                curveToRelative(0.32f, 0.67f, 0.67f, 1.34f, 1.05f, 2f)
                lineToRelative(0.24f, 0.38f)
                lineToRelative(22.26f, 34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.39f, -8.76f)
                lineToRelative(-22.13f, -33.79f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 166.4f, 190f)
                curveToRelative(0.07f, 0.13f, 0.15f, 0.26f, 0.23f, 0.38f)
                lineToRelative(10.68f, 16.31f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 202.31f)
                lineTo(192f, 144f)
                arcToRelative(74.84f, 74.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 54.69f)
                lineTo(216f, 240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 0f)
                lineTo(232f, 198.65f)
                arcTo(90.89f, 90.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 192f, 123.62f)
                close()
            }
        }.build()

        return _HandWithdrawFill!!
    }

@Suppress("ObjectPropertyName")
private var _HandWithdrawFill: ImageVector? = null
