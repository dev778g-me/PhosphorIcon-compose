package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.WebhooksLogoFill: ImageVector
    get() {
        if (_WebhooksLogoFill != null) {
            return _WebhooksLogoFill!!
        }
        _WebhooksLogoFill = ImageVector.Builder(
            name = "Filled.WebhooksLogoFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(50.15f, 160f)
                lineTo(89.07f, 92.57f)
                lineToRelative(-2.24f, -3.88f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = true, 85.05f, -44.17f)
                arcToRelative(8.17f, 8.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.19f, 10.4f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.35f, -3.72f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = false, -56.77f, 29.3f)
                arcToRelative(0.57f, 0.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.08f, 0.13f)
                lineToRelative(13.83f, 23.94f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 8f)
                lineTo(77.86f, 176f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, -27.71f, -16f)
                close()
                moveTo(191.15f, 120f)
                lineTo(178.81f, 120f)
                lineTo(141.86f, 56f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -27.71f, 16f)
                lineToRelative(34.64f, 60f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.92f, 4f)
                horizontalLineToRelative(35.63f)
                curveToRelative(17.89f, 0f, 32.95f, 14.64f, 32.66f, 32.53f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192.31f, 200f)
                arcToRelative(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.28f, 7.33f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8.67f)
                arcToRelative(48.05f, 48.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 48f, -48.93f)
                curveTo(239.49f, 140.79f, 217.48f, 120f, 191.19f, 120f)
                close()
                moveTo(208f, 167.23f)
                curveToRelative(-0.4f, -8.61f, -7.82f, -15.23f, -16.43f, -15.23f)
                lineTo(114.81f, 152f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.93f, 4f)
                lineTo(91.72f, 184f)
                horizontalLineToRelative(0f)
                arcToRelative(32f, 32f, 0f, isMoreThanHalf = true, isPositiveArc = true, -53.47f, -35f)
                arcToRelative(8.2f, 8.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.92f, -11f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -11.72f, 1.17f)
                arcTo(47.63f, 47.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16f, 167.54f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 105.55f, 192f)
                verticalLineToRelative(0f)
                lineToRelative(4.62f, -8f)
                lineTo(192f, 184f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 208f, 167.23f)
                close()
            }
        }.build()

        return _WebhooksLogoFill!!
    }

@Suppress("ObjectPropertyName")
private var _WebhooksLogoFill: ImageVector? = null
