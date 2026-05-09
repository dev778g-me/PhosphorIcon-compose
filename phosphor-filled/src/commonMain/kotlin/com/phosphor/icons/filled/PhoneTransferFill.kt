package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.PhoneTransferFill: ImageVector
    get() {
        if (_PhoneTransferFill != null) {
            return _PhoneTransferFill!!
        }
        _PhoneTransferFill = ImageVector.Builder(
            name = "Filled.PhoneTransferFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(136f, 72f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, -8f)
                horizontalLineToRelative(52.69f)
                lineTo(178.34f, 45.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, -11.32f)
                lineToRelative(32f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.32f)
                lineToRelative(-32f, 32f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -11.32f, -11.32f)
                lineTo(196.69f, 80f)
                lineTo(144f, 80f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 136f, 72f)
                close()
                moveTo(214.36f, 166.46f)
                lineTo(167.25f, 145.35f)
                lineTo(167.14f, 145.29f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.18f, 1.4f)
                arcToRelative(8.12f, 8.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.75f, 0.56f)
                lineTo(126.87f, 168f)
                curveToRelative(-15.42f, -7.49f, -31.34f, -23.29f, -38.83f, -38.51f)
                lineToRelative(20.78f, -24.71f)
                curveToRelative(0.2f, -0.25f, 0.39f, -0.5f, 0.57f, -0.77f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.32f, -15.06f)
                lineToRelative(0f, -0.12f)
                lineTo(89.54f, 41.64f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -16.62f, -9.51f)
                arcTo(56.24f, 56.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 88f)
                curveToRelative(0f, 79.4f, 64.6f, 144f, 144f, 144f)
                arcToRelative(56.24f, 56.24f, 0f, isMoreThanHalf = false, isPositiveArc = false, 55.87f, -48.92f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 214.36f, 166.46f)
                close()
            }
        }.build()

        return _PhoneTransferFill!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneTransferFill: ImageVector? = null
