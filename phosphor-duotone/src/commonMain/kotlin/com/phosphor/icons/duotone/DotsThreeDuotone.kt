package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.DotsThreeDuotone: ImageVector
    get() {
        if (_DotsThreeDuotone != null) {
            return _DotsThreeDuotone!!
        }
        _DotsThreeDuotone = ImageVector.Builder(
            name = "Duotone.DotsThreeDuotone",
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
                moveTo(32f, 80f)
                lineTo(224f, 80f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 96f)
                lineTo(240f, 160f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 176f)
                lineTo(32f, 176f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 160f)
                lineTo(16f, 96f)
                arcTo(16f, 16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 80f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(128f, 128f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(196f, 128f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(60f, 128f)
                moveToRelative(-12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, -24f, 0f)
            }
        }.build()

        return _DotsThreeDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _DotsThreeDuotone: ImageVector? = null
